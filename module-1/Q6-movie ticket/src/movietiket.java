import java.util.Scanner;
public class movietiket{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer age: ");
        int age = scanner.nextInt();
        System.out.print("Enter day code (W for Weekday, H for Holiday): ");
        char dayCode = scanner.next().charAt(0);
        String category;
        int ticketPrice;
        if (age < 12) {
            category = "Child";
            ticketPrice = 100;

        } else if (age >= 60) {
            category = "Senior Citizen";
            ticketPrice = 120;

        } else {
            category = "Regular";

            if (dayCode == 'W') {
                ticketPrice = 150;
            } else {
                ticketPrice = 200;
            }
        }
        System.out.println("Age: " + age);
        System.out.println("Day Code: " + dayCode);
        System.out.println("Category: " + category);
        System.out.println("Ticket Price: Rs. " + ticketPrice);
        scanner.close();
    }
}
