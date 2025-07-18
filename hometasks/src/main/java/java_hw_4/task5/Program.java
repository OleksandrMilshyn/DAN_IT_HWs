package java_hw_4.task5;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10]; //создаю массив
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // заполняю массив рандомными числами
        }
        System.out.println("Please enter an integer");
        int number = scanner.nextInt(); // пользователь вводит число
        boolean found = false; // использую тернарный оператор
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) { // проверяю соответствует ли введённое число каждому из элементов массива
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
