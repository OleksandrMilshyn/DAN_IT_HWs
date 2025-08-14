package java_hw_4.task5;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10]; //create the array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // fill the array with random numbers
        }
        System.out.println("Please enter an integer");
        int number = scanner.nextInt(); // a user enter a number
        boolean found = false; // using the ternary operator
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) { // I check if the entered number corresponds to each of the array elements
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("This number IS in the array");
        } else {
            System.out.println("This number is NOT in the array");
        }
    scanner.close();
    }
}
