public class Config {
    private int totalTickets;
    private int maxTicketCapacity;

    // Constructor with default values
    public Config() {
        this.totalTickets = 100;     // Start with 100 tickets
        this.maxTicketCapacity = 50;  // Maximum 50 tickets at a time
    }

    // Getters and setters
    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }
}