// Config.java
public class Config {
    private int totalTickets;        // Total tickets in the system
    private int ticketReleaseRate;   // How many tickets vendor releases at once
    private int customerRetrievalRate; // How many tickets customer can buy at once
    private int maxTicketCapacity;    // Maximum tickets in the pool at one time

    // Constructor with default values
    public Config() {
        this.totalTickets = 100;           // Default: 100 total tickets
        this.ticketReleaseRate = 5;        // Default: 5 tickets per release
        this.customerRetrievalRate = 2;    // Default: 2 tickets per purchase
        this.maxTicketCapacity = 50;       // Default: 50 tickets max in pool
    }

    // Getters
    public int getTotalTickets() {
        return totalTickets;
    }

    public int getTicketReleaseRate() {
        return ticketReleaseRate;
    }

    public int getCustomerRetrievalRate() {
        return customerRetrievalRate;
    }

    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    // Setters
    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public void setTicketReleaseRate(int ticketReleaseRate) {
        this.ticketReleaseRate = ticketReleaseRate;
    }

    public void setCustomerRetrievalRate(int customerRetrievalRate) {
        this.customerRetrievalRate = customerRetrievalRate;
    }

    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }

    // Validate configuration
    public boolean isValid() {
        return totalTickets > 0 &&
                maxTicketCapacity > 0 &&
                ticketReleaseRate > 0 &&
                customerRetrievalRate > 0 &&
                maxTicketCapacity <= totalTickets;
    }
}