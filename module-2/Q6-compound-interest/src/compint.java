import java.util.Scanner;
public class compint {
    // Recursive method to calculate compound amount
    static double calculateAmount(double principal, double rate, int years) {
        // Base case
        if (years == 0) {
            return principal;
        }
        // Recursive case
        return calculateAmount(
                principal * (1 + rate / 100),
                rate,
                years - 1
        );
    }
    // Recursive factorial method
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual rate (%): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        double amount = calculateAmount(principal, rate, years);
        System.out.printf("Final Amount: %.2f%n", amount);
        System.out.println("Factorial of 6: " + factorial(6));
        scanner.close();
    }
}
