// Vendor.java
public class Vendor {
    private int vendorId;
    private int ticketsToRelease;
    private int totalTicketsReleased;

    public Vendor(int vendorId, int ticketsToRelease) {
        this.vendorId = vendorId;
        this.ticketsToRelease = ticketsToRelease;
        this.totalTicketsReleased = 0;
    }

    public void releaseTickets(TicketPool pool) {
        for (int i = 0; i < ticketsToRelease && !pool.isFull(); i++) {
            Ticket ticket = new Ticket(generateTicketId(), 50.0);
            if (pool.addTicket(ticket)) {
                totalTicketsReleased++;
                System.out.println("Vendor " + vendorId + " released ticket: " + ticket.getTicketId());
            }
        }
    }

    private int generateTicketId() {
        return vendorId * 1000 + totalTicketsReleased;
    }

    public int getVendorId() {
        return vendorId;
    }

    public int getTotalTicketsReleased() {
        return totalTicketsReleased;
    }
}