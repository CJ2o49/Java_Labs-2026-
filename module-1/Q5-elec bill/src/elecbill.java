import java.util.Scanner;
public class elecbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int unittaken = sc.nextInt();
        System.out.print("Enter due amount: ");
        double prevdue = sc.nextDouble();

        // Calculate electricity bill
        double bill;

        if (unittaken <= 100) {
            bill = unittaken * 3;
        } else {
            bill = (100 * 3) + ((unittaken - 100) * 5);
        }
        boolean flagged = unittaken > 300 && prevdue > 0;
        System.out.printf("Units Consumed: %d%n", unittaken);
        System.out.printf("Previous Due: Rs. %.2f%n", prevdue);
        System.out.printf("Current Bill: Rs. %.2f%n", bill);
        System.out.println("Customer Flagged: " + flagged);

        int count = 5;
        System.out.println("\nPre-increment (++count): " + (++count));
        System.out.println("Post-increment (count++): " + (count++));
        System.out.println("Count after post-increment: " + count);

        sc.close();
    }
}