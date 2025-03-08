package Loops;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num, reversedNum = 0, remainder;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum)
            System.out.println(originalNum + " is a Palindrome.");
        else
            System.out.println(originalNum + " is not a Palindrome.");
        
        scanner.close();
    }
}
   

