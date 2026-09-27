/* Question 3: Invalid Integer Input */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question03InvalidIntegerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            input.close();
        }
    }
}
