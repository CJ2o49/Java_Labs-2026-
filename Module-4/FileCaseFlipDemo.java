/*
 * Question 1: File Case Flip Program
 *
 * This program asks the user for a file name, displays the first five lines,
 * flips the case of every alphabetic character, saves the changed content,
 * and displays the first five updated lines.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCaseFlipDemo {

    public static void main(String[] args) {
        File originalFile;

        // Read the file name from the keyboard until a valid file is found.
        try (Scanner keyboard = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter the file name: ");
                String fileName = keyboard.nextLine();
                originalFile = new File(fileName);

                // Check that the path exists and represents a file, not a folder.
                if (originalFile.exists() && originalFile.isFile()) {
                    System.out.println("File found.\n");
                    break;
                }

                System.out.println("File not found. Please try again.\n");
            }

            // Display the first five lines before changing the file.
            System.out.println("FIRST FIVE LINES OF THE ORIGINAL FILE");
            System.out.println("-------------------------------------");
            displayFirstFiveLines(originalFile);

            // Store the changed content in a temporary file first.
            File tempFile = new File("temp.txt");
            try {
                flipFileCase(originalFile, tempFile);
                copyFile(tempFile, originalFile);
            } catch (FileNotFoundException e) {
                System.out.println("Error while processing the file: " + e.getMessage());
                return;
            } finally {
                // Delete the temporary file after it is no longer needed.
                if (tempFile.exists() && !tempFile.delete()) {
                    System.out.println("Warning: The temporary file could not be deleted.");
                }
            }

            // Display the first five lines after changing the file.
            System.out.println();
            System.out.println("FIRST FIVE LINES AFTER FLIPPING THE CASE");
            System.out.println("----------------------------------------");
            displayFirstFiveLines(originalFile);
        }
    }

    // Reads the original file, flips each line, and writes it to the temporary file.
    public static void flipFileCase(File originalFile, File tempFile)
            throws FileNotFoundException {
        try (Scanner reader = new Scanner(originalFile);
             PrintWriter writer = new PrintWriter(tempFile)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                writer.println(flipCase(line));
            }
        }
    }

    // Copies the contents of the temporary file back into the original file.
    public static void copyFile(File sourceFile, File destinationFile)
            throws FileNotFoundException {
        try (Scanner reader = new Scanner(sourceFile);
             PrintWriter writer = new PrintWriter(destinationFile)) {
            while (reader.hasNextLine()) {
                writer.println(reader.nextLine());
            }
        }
    }

    // Displays at most the first five lines of a file.
    public static void displayFirstFiveLines(File file) {
        try (Scanner reader = new Scanner(file)) {
            int count = 0;
            while (reader.hasNextLine() && count < 5) {
                System.out.println(reader.nextLine());
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open the file: " + e.getMessage());
        }
    }

    // Changes uppercase letters to lowercase and lowercase letters to uppercase.
    public static String flipCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (Character.isUpperCase(character)) {
                result += Character.toLowerCase(character);
            } else if (Character.isLowerCase(character)) {
                result += Character.toUpperCase(character);
            } else {
                // Keep numbers, spaces, and punctuation unchanged.
                result += character;
            }
        }

        return result;
    }
}
