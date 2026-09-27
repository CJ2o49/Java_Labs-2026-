/* Question 4: Multiple Exception Handling */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question04MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int first = input.nextInt();
            System.out.print("Enter the second integer: ");
            int second = input.nextInt();

            // The array has two elements; index 2 demonstrates array validation.
            int[] numbers = {first, second};
            System.out.println("Division result: " + (numbers[0] / numbers[1]));
            System.out.println("Third element: " + numbers[2]);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: The second number cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The array does not contain a third element.");
        } finally {
            input.close();
        }
    }
}
