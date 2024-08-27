import java.util.Scanner;

public class Q12_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string to reverse: ");
        String originalString = scanner.nextLine();

        // Reverse the string using the two-pointer method
        String reversedString = reverseStringUsingTwoPointers(originalString);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to reverse the string using the two-pointer technique
    public static String reverseStringUsingTwoPointers(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize two pointers: one at the start and one at the end of the array
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters while left pointer is less than right pointer
        while (left < right) {
            // Swap the characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }

        // Convert the character array back to a string and return
        return new String(charArray);
    }
}
