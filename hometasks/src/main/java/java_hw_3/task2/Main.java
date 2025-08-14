package java_hw_3.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int a = scanner.nextInt();

        System.out.println("Please enter the second number");
        int b = scanner.nextInt();

        System.out.println("Please enter the third number");
        int c = scanner.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)){
            System.out.println("You can build a triangle");
        } else {
            System.out.println("You can not build a triangle");
        }
    }
}
