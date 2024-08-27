import java.util.Scanner;

public class Q9_NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hexadecimal = Integer.toHexString(number).toUpperCase(); 


        System.out.println("Given Number " + number);
        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);

        scanner.close();
    }
}
