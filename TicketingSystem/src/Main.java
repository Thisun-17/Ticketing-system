public class Main {
    public static void main(String[] args) {
        // Create system components
        Config config = new Config();
        TicketPool ticketPool = new TicketPool(config);

        // Create vendors and customers
        Vendor vendor1 = new Vendor(1, 3, ticketPool, config);
        Vendor vendor2 = new Vendor(2, 2, ticketPool, config);
        Customer customer1 = new Customer(1, ticketPool, config);
        Customer customer2 = new Customer(2, ticketPool, config);

        // Create threads
        Thread vendorThread1 = new Thread(vendor1, "Vendor-1");
        Thread vendorThread2 = new Thread(vendor2, "Vendor-2");
        Thread customerThread1 = new Thread(customer1, "Customer-1");
        Thread customerThread2 = new Thread(customer2, "Customer-2");

        System.out.println("Starting ticket system simulation...");

        // Start all threads
        vendorThread1.start();
        vendorThread2.start();
        customerThread1.start();
        customerThread2.start();

        // Let system run for a few seconds
        try {
            Thread.sleep(10000);  // Run for 10 seconds

            // Stop all threads
            vendor1.stop();
            vendor2.stop();
            customer1.stop();
            customer2.stop();

            // Wait for threads to finish
            vendorThread1.join();
            vendorThread2.join();
            customerThread1.join();
            customerThread2.join();

            // Print final status
            System.out.println("\nFinal Status:");
            System.out.println("Available tickets: " + ticketPool.getAvailableTickets());
            System.out.println("Vendor 1 released: " + vendor1.getTotalTicketsReleased());
            System.out.println("Vendor 2 released: " + vendor2.getTotalTicketsReleased());
            System.out.println("Customer 1 purchased: " + customer1.getPurchasedTickets().size());
            System.out.println("Customer 2 purchased: " + customer2.getPurchasedTickets().size());

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}