import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get exactly 4 integer inputs
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter number 4: ");
        int num4 = scanner.nextInt();

        // Convert to ASCII characters (no loops used)
        char char1 = (char) num1;
        char char2 = (char) num2;
        char char3 = (char) num3;
        char char4 = (char) num4;

        // Display the result
        System.out.println("Magic Board Output:");
        System.out.println(char1 + " " + char2 + " " + char3 + " " + char4);

        scanner.close();
    }
}
