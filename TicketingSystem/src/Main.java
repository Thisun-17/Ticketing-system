public class Main {
    public static void main(String[] args) {
        // Create system components
        Config config = new Config();
        TicketPool ticketPool = new TicketPool(config);

        // Create vendors
        Vendor vendor1 = new Vendor(1, 3);  // Vendor 1 releases 3 tickets at a time

        // Create customers
        Customer customer1 = new Customer(1);
        Customer customer2 = new Customer(2);

        System.out.println("Testing Ticket System:");
        System.out.println("Initial available tickets: " + ticketPool.getAvailableTickets());

        // Vendor releases tickets
        System.out.println("\nVendor releasing tickets...");
        vendor1.releaseTickets(ticketPool);
        System.out.println("Available tickets: " + ticketPool.getAvailableTickets());

        // Customers purchase tickets
        System.out.println("\nCustomers purchasing tickets...");
        customer1.purchaseTicket(ticketPool);
        customer2.purchaseTicket(ticketPool);

        // Print final status
        System.out.println("\nFinal Status:");
        System.out.println("Available tickets: " + ticketPool.getAvailableTickets());
        System.out.println("Customer 1 tickets: " + customer1.getPurchasedTickets().size());
        System.out.println("Customer 2 tickets: " + customer2.getPurchasedTickets().size());
    }
}