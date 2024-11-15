import java.util.concurrent.atomic.AtomicInteger;

/**
 * Represents a ticket vendor in the system.
 * Implements Runnable for concurrent ticket releasing.
 */
public class Vendor implements Runnable {
    private int vendorId;
    private int ticketsToRelease;
    private AtomicInteger totalTicketsReleased;
    private TicketPool ticketPool;
    private boolean isActive;
    private Config config;

    /**
     * Creates a new vendor with specified ID and release rate.
     * @param vendorId Unique identifier for the vendor
     * @param ticketsToRelease Number of tickets to release at once
     * @param ticketPool The ticket pool to release tickets into
     * @param config System configuration
     */
    public Vendor(int vendorId, int ticketsToRelease, TicketPool ticketPool, Config config) {
        this.vendorId = vendorId;
        this.ticketsToRelease = ticketsToRelease;
        this.totalTicketsReleased = new AtomicInteger(0);
        this.ticketPool = ticketPool;
        this.config = config;
        this.isActive = true;
    }

    @Override
    public void run() {
        while (isActive) {
            try {
                releaseTickets();
                // Wait according to release rate
                Thread.sleep(1000 * config.getTicketReleaseRate());
            } catch (InterruptedException e) {
                System.out.println("Vendor " + vendorId + " was interrupted.");
                isActive = false;
            }
        }
    }

    /**
     * Releases tickets into the ticket pool.
     */
    private void releaseTickets() {
        for (int i = 0; i < ticketsToRelease && !ticketPool.isFull(); i++) {
            Ticket ticket = new Ticket(generateTicketId(), 50.0);
            if (ticketPool.addTicket(ticket)) {
                totalTicketsReleased.incrementAndGet();
                System.out.println("Vendor " + vendorId + " released ticket: " + ticket.getTicketId());
            }
        }
    }

    /**
     * Stops the vendor's ticket releasing activity.
     */
    public void stop() {
        isActive = false;
    }

    private int generateTicketId() {
        return vendorId * 1000 + totalTicketsReleased.get();
    }

    public int getVendorId() {
        return vendorId;
    }

    public int getTotalTicketsReleased() {
        return totalTicketsReleased.get();
    }
}