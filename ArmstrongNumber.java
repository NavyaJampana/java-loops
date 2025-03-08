package Loops;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num, remainder, result = 0;

        while (num != 0) {
            remainder = num % 10;
            result += remainder * remainder * remainder;
            num /= 10;
        }

        if (result == originalNum)
            System.out.println(originalNum + " is an Armstrong number.");
        else
            System.out.println(originalNum + " is not an Armstrong number.");
        
        scanner.close();
    }
}
