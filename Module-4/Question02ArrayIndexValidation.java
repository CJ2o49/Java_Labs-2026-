/* Question 2: Array Index Validation */
import java.util.Scanner;

public class Question02ArrayIndexValidation {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an index from 0 to 4: ");
            int index = input.nextInt();
            System.out.println("Value: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The index must be between 0 and 4.");
        } finally {
            input.close();
        }
    }
}
