import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class employeefile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter salary: ");
        String salary = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("Employee Name: " + name + "\n");
            writer.write("Employee ID: " + id + "\n");
            writer.write("Salary: " + salary + "\n");

            writer.close();

            System.out.println("Employee details written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }
        sc.close();
    }
}