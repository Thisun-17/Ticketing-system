// TicketPool.java
import java.util.ArrayList;
import java.util.List;

public class TicketPool {
    private List<Ticket> tickets;
    private final int maxCapacity;
    private int totalTicketsProcessed;

    public TicketPool(Config config) {
        this.tickets = new ArrayList<>();
        this.maxCapacity = config.getMaxTicketCapacity();
        this.totalTicketsProcessed = 0;
    }

    // Add a ticket to the pool
    public synchronized boolean addTicket(Ticket ticket) {
        if (tickets.size() < maxCapacity) {
            tickets.add(ticket);
            totalTicketsProcessed++;
            return true;
        }
        return false;
    }

    // Remove a ticket from the pool
    public synchronized Ticket removeTicket() {
        if (!tickets.isEmpty()) {
            return tickets.remove(0);
        }
        return null;
    }

    // Get current number of available tickets
    public int getAvailableTickets() {
        return tickets.size();
    }

    // Get total number of tickets that have been processed
    public int getTotalTicketsProcessed() {
        return totalTicketsProcessed;
    }

    // Check if pool is full
    public boolean isFull() {
        return tickets.size() >= maxCapacity;
    }
}