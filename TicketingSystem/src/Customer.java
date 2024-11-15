import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer who can purchase tickets from the ticket pool.
 */
public class Customer {
    private int customerId;
    private List<Ticket> purchasedTickets;

    /**
     * Creates a new customer with the specified ID.
     * @param customerId Unique identifier for the customer
     */
    public Customer(int customerId) {
        this.customerId = customerId;
        this.purchasedTickets = new ArrayList<>();
    }

    /**
     * Attempts to purchase a ticket from the ticket pool.
     * @param pool The ticket pool to purchase from
     * @return true if purchase was successful, false otherwise
     */
    public boolean purchaseTicket(TicketPool pool) {
        Ticket ticket = pool.removeTicket();
        if (ticket != null) {
            purchasedTickets.add(ticket);
            System.out.println("Customer " + customerId + " purchased ticket: " + ticket.getTicketId());
            return true;
        }
        return false;
    }

    /**
     * Gets the customer's ID.
     * @return customer ID
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Gets the list of purchased tickets.
     * @return list of tickets purchased by this customer
     */
    public List<Ticket> getPurchasedTickets() {
        return purchasedTickets;
    }
}