import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Read an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // Example 2: Read a double
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // Example 3: Read a string (one word)
        System.out.print("Enter a single word: ");
        String word = scanner.next();
        System.out.println("You entered: " + word);

        // Example 4: Read a full line
        scanner.nextLine(); // consume the leftover newline
        System.out.print("Enter a full sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        scanner.close();
    }
}
