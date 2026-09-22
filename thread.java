import java.util.Scanner;

public class thread {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Thread to print even numbers
        Thread evenThread = new Thread(() -> {
            System.out.println("Even numbers:");
            for (int i = 2; i <= n; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        });

        // Thread to print odd numbers
        Thread oddThread = new Thread(() -> {
            System.out.println("Odd numbers:");
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        });

        // Start both threads
        evenThread.start();
        oddThread.start();

        // Wait for both threads to finish
        evenThread.join();
        oddThread.join();

        System.out.println("Both threads completed.");

        sc.close();
    }
}