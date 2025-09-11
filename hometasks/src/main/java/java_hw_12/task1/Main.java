package java_hw_12.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Hello. To use the calculator, select: +, -, *, /. Type 'exit' to quit.");
                String op = scanner.nextLine().trim();
                if (op.equalsIgnoreCase("exit")) break;

                System.out.println("Enter the first number:");
                String inputA = scanner.nextLine().trim();
                double a;
                try {
                    a = Double.parseDouble(inputA);
                } catch (NumberFormatException e) {
                    throw new ValueErrorException("Error: You entered a non-numeric value. Try again.");
                }

                System.out.println("Enter the second number:");
                String inputB = scanner.nextLine().trim();
                double b;
                try {
                    b = Double.parseDouble(inputB);
                } catch (NumberFormatException e) {
                    throw new ValueErrorException("Error: You entered a non-numeric value. Try again.");
                }

                Calculatable operation = Calculator.getOperation(op);
                double result = operation.calculate(a, b);
                System.out.println("The result is: " + result);

            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            } catch (ValueErrorException e) {
                System.out.println(e.getMessage());
            } catch (UnknownException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Program terminated.");
    }
}
