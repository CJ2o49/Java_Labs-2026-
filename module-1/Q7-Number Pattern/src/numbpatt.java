import java.util.Scanner;
public class numbpatt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int count = 0;
        System.out.println("\n========== NUMBER INPUT ==========");
        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int number = sc.nextInt();
            if (number == -1) {
                break;
            }
            if (number < 0) {
                continue;
            }
            sum += number;
            count++;
        }
        System.out.println("\n========== RESULT ==========");
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("Average: No valid numbers entered.");
        }

        sc.close();
    }
}