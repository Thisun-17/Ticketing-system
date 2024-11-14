public class Ticket {
    private int ticketId;
    private double price;
    private String status; // "available" or "sold"

    // Constructor
    public Ticket(int ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
        this.status = "available";
    }

    // Getters and setters
    public int getTicketId() {
        return ticketId;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}