import java.util.ArrayList;
import java.util.List;

/**
 * Manages the pool of available tickets in the system.
 * Provides thread-safe operations for adding and removing tickets.
 */
public class TicketPool {
    private List<Ticket> tickets;
    private final int maxCapacity;
    private int totalTicketsProcessed;

    /**
     * Creates a new ticket pool with specified capacity from configuration.
     * @param config System configuration containing pool settings
     */
    public TicketPool(Config config) {
        this.tickets = new ArrayList<>();
        this.maxCapacity = config.getMaxTicketCapacity();
        this.totalTicketsProcessed = 0;
    }

    /**
     * Adds a ticket to the pool if capacity allows.
     * @param ticket The ticket to add
     * @return true if ticket was added, false if pool is full
     */
    public synchronized boolean addTicket(Ticket ticket) {
        if (tickets.size() < maxCapacity) {
            tickets.add(ticket);
            totalTicketsProcessed++;
            return true;
        }
        return false;
    }

    /**
     * Removes and returns a ticket from the pool.
     * @return The removed ticket, or null if pool is empty
     */
    public synchronized Ticket removeTicket() {
        if (!tickets.isEmpty()) {
            return tickets.remove(0);
        }
        return null;
    }

    /**
     * Gets the current number of available tickets.
     * @return number of available tickets
     */
    public int getAvailableTickets() {
        return tickets.size();
    }

    /**
     * Gets the total number of tickets processed.
     * @return total number of tickets processed
     */
    public int getTotalTicketsProcessed() {
        return totalTicketsProcessed;
    }

    /**
     * Checks if the ticket pool is at maximum capacity.
     * @return true if pool is full, false otherwise
     */
    public boolean isFull() {
        return tickets.size() >= maxCapacity;
    }
}