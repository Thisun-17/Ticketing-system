/**
 * Represents a ticket vendor in the system.
 * Responsible for releasing tickets into the ticket pool.
 */
public class Vendor {
    private int vendorId;
    private int ticketsToRelease;
    private int totalTicketsReleased;

    /**
     * Creates a new vendor with specified ID and release rate.
     * @param vendorId Unique identifier for the vendor
     * @param ticketsToRelease Number of tickets to release at once
     */
    public Vendor(int vendorId, int ticketsToRelease) {
        this.vendorId = vendorId;
        this.ticketsToRelease = ticketsToRelease;
        this.totalTicketsReleased = 0;
    }

    /**
     * Releases tickets into the specified ticket pool.
     * @param pool The ticket pool to release tickets into
     */
    public void releaseTickets(TicketPool pool) {
        for (int i = 0; i < ticketsToRelease && !pool.isFull(); i++) {
            Ticket ticket = new Ticket(generateTicketId(), 50.0);
            if (pool.addTicket(ticket)) {
                totalTicketsReleased++;
                System.out.println("Vendor " + vendorId + " released ticket: " + ticket.getTicketId());
            }
        }
    }

    /**
     * Generates a unique ticket ID.
     * @return generated ticket ID
     */
    private int generateTicketId() {
        return vendorId * 1000 + totalTicketsReleased;
    }

    /**
     * Gets the vendor's ID.
     * @return vendor ID
     */
    public int getVendorId() {
        return vendorId;
    }

    /**
     * Gets the total number of tickets released by this vendor.
     * @return total tickets released
     */
    public int getTotalTicketsReleased() {
        return totalTicketsReleased;
    }
}