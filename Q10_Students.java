import java.util.Arrays;
import java.util.Scanner;

public class Q10_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the array to store up to 10 student names
        String[] nameOfStudents = new String[10];
        int n; // Number of students

        // Input the number of students (up to 10)
        do {
            System.out.print("Enter the number of students (up to 10): ");
            n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
        } while (n < 1 || n > 10);

        // Input the names of the students
        System.out.println("Enter the names of the students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            nameOfStudents[i] = scanner.nextLine();
        }

        // Sort the array using Arrays.sort()
        Arrays.sort(nameOfStudents, 0, n);

        // Display the sorted names
        System.out.println("\nSorted student names:");
        for (int i = 0; i < n; i++) {
            System.out.println(nameOfStudents[i]);
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
