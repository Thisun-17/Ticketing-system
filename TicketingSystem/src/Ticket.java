/**
 * Represents a single ticket in the ticketing system.
 * Each ticket has a unique ID, price, and availability status.
 */
public class Ticket {
    private int ticketId;
    private double price;
    private boolean isAvailable;

    /**
     * Creates a new ticket with specified ID and price.
     * @param ticketId Unique identifier for the ticket
     * @param price Price of the ticket
     */
    public Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
        this.isAvailable = true;
    }

    /**
     * Gets the ticket's unique identifier.
     * @return The ticket ID
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * Gets the ticket's price.
     * @return The price of the ticket
     */
    public double getPrice() {
        return price;
    }

    /**
     * Checks if the ticket is available for purchase.
     * @return true if the ticket is available, false otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability status of the ticket.
     * @param available new availability status
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}