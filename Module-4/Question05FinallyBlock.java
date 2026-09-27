/* Question 5: Finally Block */
import java.util.Scanner;

public class Question05FinallyBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = input.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = input.nextInt();
            System.out.println("Result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This message runs whether an exception occurs or not.
            System.out.println("The program has completed.");
            input.close();
        }
    }
}
