public class Main {
    public static void main(String[] args) {
        // Create configuration
        Config config = new Config();

        // Create some test tickets
        Ticket ticket1 = new Ticket(1, 50.0);
        Ticket ticket2 = new Ticket(2, 50.0);

        // Print ticket information
        System.out.println("Ticket 1 - ID: " + ticket1.getTicketId()
                + ", Status: " + ticket1.getStatus());
        System.out.println("Ticket 2 - ID: " + ticket2.getTicketId()
                + ", Status: " + ticket2.getStatus());

        // Print configuration
        System.out.println("\nConfiguration:");
        System.out.println("Total Tickets: " + config.getTotalTickets());
        System.out.println("Max Capacity: " + config.getMaxTicketCapacity());
    }
}