public class bustiket {

    // Instance field - each ticket has its own passenger name
    String passengerName;

    // Static field - shared by all Ticket objects
    static int ticketCount = 0;

    // Static final constant - cannot be changed
    static final double BASE_FARE = 50.0;

    // Constructor
    bustiket(String passengerName) {
        this.passengerName = passengerName;
        ticketCount++;

        System.out.println(
                "Ticket booked for " + passengerName +
                        " | Ticket Count: " + ticketCount
        );
    }

    // Static method
    static void printTotalTicketsSold() {
        System.out.println("Total Tickets Sold: " + ticketCount);
    }

    public static void main(String[] args) {

        bustiket t1 = new bustiket("Christopher");
        bustiket t2 = new bustiket("tony");
        bustiket t3 = new bustiket("tim");

        // Call static method without creating another object
        printTotalTicketsSold();

    }
}