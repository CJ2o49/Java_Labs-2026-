import java.util.Scanner;
public class attencalc{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total classes:");
        int totclass = scanner.nextInt();
        System.out.println("enter the classes attended:");
        int attclass = scanner.nextInt();
        //calculating the attendance percentage
        double percentage = ((double)attclass/totclass)*100;
        //displaying the output
        System.out.printf("The total attendance percentage: %.2f%%\n", percentage);
        //closing the scanner
        scanner.close();


    }

}
