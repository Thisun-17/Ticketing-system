// Ticket.java
public class Ticket {
    private int ticketId;    // Changed from String to int
    private double price;
    private boolean isAvailable;

    public Ticket(int ticketId, double price) {  // Changed parameter type to int
        this.ticketId = ticketId;
        this.price = price;
        this.isAvailable = true;
    }

    // Updated getter to return int
    public int getTicketId() {
        return ticketId;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}