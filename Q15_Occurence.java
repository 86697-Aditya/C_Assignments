import java.util.Scanner;

public class Q15_Occurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        int[] count = new int[26];

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

      System.out.println("Occurrences of each alphabet:");
        for (char i = 'a'; i <= 'z'; i++) {
            if (count[i - 'a'] > 0) {
                System.out.println(Character.toUpperCase(i) + " : " + count[i - 'a']);
            }
        }

        scanner.close();
    }
}
