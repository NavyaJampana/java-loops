package Loops;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int largest = (a > b && a > c) ? a : (b > c) ? b : c;

        System.out.println("Largest Number: " + largest);
        scanner.close();
    }
}
