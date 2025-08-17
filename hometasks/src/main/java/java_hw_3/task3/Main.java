package java_hw_3.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int a = scanner.nextInt();

        System.out.println("Please enter the second number");
        int b = scanner.nextInt();

        int subtractionResult = a >= b ? a - b : b - a;
            System.out.println(subtractionResult);
    }
}
