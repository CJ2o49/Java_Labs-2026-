import java.util.Scanner;

public class warehouseinvent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] stock = {12, 5, 18, 7, 25, 9, 14, 3};
        System.out.println("========== STOCK STATUS ==========");
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] < 10) {
                System.out.println("Product " + i + ": " + stock[i] + " - REORDER");
            } else {
                System.out.println("Product " + i + ": " + stock[i] + " - OK");
            }
        }
        System.out.print("\nEnter product to search: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Stock at product " + index + ": " + stock[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product index");
        }
        int totalStock = 0;
        for (int i = 0; i < stock.length; i++) {
            totalStock += stock[i];
        }
        System.out.println("Total Stock: " + totalStock);
        scanner.close();
    }
}
