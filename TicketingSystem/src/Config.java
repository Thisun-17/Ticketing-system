/**
 * Configuration class for the ticketing system.
 * Stores and manages all system-wide settings and parameters.
 */
public class Config {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    /**
     * Creates a new configuration with default values.
     */
    public Config() {
        this.totalTickets = 100;           // Default: 100 total tickets
        this.ticketReleaseRate = 5;        // Default: 5 tickets per release
        this.customerRetrievalRate = 2;    // Default: 2 tickets per purchase
        this.maxTicketCapacity = 50;       // Default: 50 tickets max in pool
    }

    /**
     * Gets the total number of tickets in the system.
     * @return total number of tickets
     */
    public int getTotalTickets() {
        return totalTickets;
    }

    /**
     * Gets the rate at which vendors release tickets.
     * @return ticket release rate
     */
    public int getTicketReleaseRate() {
        return ticketReleaseRate;
    }

    /**
     * Gets the rate at which customers can retrieve tickets.
     * @return customer retrieval rate
     */
    public int getCustomerRetrievalRate() {
        return customerRetrievalRate;
    }

    /**
     * Gets the maximum capacity of tickets in the pool.
     * @return maximum ticket capacity
     */
    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }

    /**
     * Sets the total number of tickets.
     * @param totalTickets new total tickets value
     */
    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    /**
     * Sets the ticket release rate.
     * @param ticketReleaseRate new release rate
     */
    public void setTicketReleaseRate(int ticketReleaseRate) {
        this.ticketReleaseRate = ticketReleaseRate;
    }

    /**
     * Sets the customer retrieval rate.
     * @param customerRetrievalRate new retrieval rate
     */
    public void setCustomerRetrievalRate(int customerRetrievalRate) {
        this.customerRetrievalRate = customerRetrievalRate;
    }

    /**
     * Sets the maximum ticket capacity.
     * @param maxTicketCapacity new maximum capacity
     */
    public void setMaxTicketCapacity(int maxTicketCapacity) {
        this.maxTicketCapacity = maxTicketCapacity;
    }

    /**
     * Validates the current configuration settings.
     * @return true if configuration is valid, false otherwise
     */
    public boolean isValid() {
        return totalTickets > 0 &&
                maxTicketCapacity > 0 &&
                ticketReleaseRate > 0 &&
                customerRetrievalRate > 0 &&
                maxTicketCapacity <= totalTickets;
    }
}