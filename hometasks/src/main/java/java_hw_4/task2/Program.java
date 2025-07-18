package java_hw_4.task2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        String number = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(number);
        String reverse = stringBuilder.reverse().toString();

        boolean numberPalindrome = reverse.equals(number);

        if (numberPalindrome){
            System.out.println("The entered number IS a palindrome");
        } else {
            System.out.println("The entered number is NOT a palindrome");
        }
    }
}
