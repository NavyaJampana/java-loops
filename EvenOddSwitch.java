package Loops;
import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " is Even.");
                break;
            case 1:
                System.out.println(num + " is Odd.");
                break;
        }

        scanner.close();
    }
}
