package java_hw_3.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the symbol +; -; /; *; % to perform a mathematical operation.");
        String operation = scanner.next();

        System.out.println("Please enter the first number");
        int firstValue = scanner.nextInt();

        System.out.println("Please enter the second number");
        int secondValue = scanner.nextInt();

        boolean minus = operation.equals("-");
        boolean plus = operation.equals("+");
        boolean division = operation.equals("/");
        boolean multiplication = operation.equals("*");
        boolean remainder = operation.equals("%");
        if (minus){
            System.out.println(firstValue-secondValue);
        } else if (plus){
            System.out.println(firstValue + secondValue);
        } else if (division){
            System.out.println(firstValue / secondValue);
        } else if (multiplication){
            System.out.println(firstValue * secondValue);
        } else if (remainder){
            System.out.println(firstValue % secondValue);
        } else{
            System.out.println("0");
        }
    }
}
