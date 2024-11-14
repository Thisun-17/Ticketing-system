public class Main {
    public static void main(String[] args) {
        // Create system components
        Config config = new Config();
        TicketPool ticketPool = new TicketPool(config);

        // Create vendors
        Vendor vendor1 = new Vendor(1, 3);  // Vendor 1 releases 3 tickets at a time
        Vendor vendor2 = new Vendor(2, 2);  // Vendor 2 releases 2 tickets at a time

        System.out.println("Testing Vendor System:");
        System.out.println("Initial available tickets: " + ticketPool.getAvailableTickets());

        // Test vendor1
        System.out.println("\nVendor 1 releasing tickets...");
        vendor1.releaseTickets(ticketPool);
        System.out.println("After Vendor 1:");
        System.out.println("Available tickets: " + ticketPool.getAvailableTickets());
        System.out.println("Vendor 1 total released: " + vendor1.getTotalTicketsReleased());

        // Test vendor2
        System.out.println("\nVendor 2 releasing tickets...");
        vendor2.releaseTickets(ticketPool);
        System.out.println("After Vendor 2:");
        System.out.println("Available tickets: " + ticketPool.getAvailableTickets());
        System.out.println("Vendor 2 total released: " + vendor2.getTotalTicketsReleased());

        System.out.println("\nFinal Pool Status:");
        System.out.println("Total tickets in pool: " + ticketPool.getAvailableTickets());
        System.out.println("Total tickets processed: " + ticketPool.getTotalTicketsProcessed());
    }
}