import java.util.Scanner;

public class Q5_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int otherCharCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
            else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
            else if (Character.isDigit(ch)) {
                digitCount++;
            }
            else {
                otherCharCount++;
            }
        }

        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Other characters: " + otherCharCount);

        scanner.close();
    }
}
