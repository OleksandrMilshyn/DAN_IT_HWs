package java_hw_4.task4;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] names = {"Petya", "Masha", "Olena", "Fedia", "Sasha", "Anton", "Glib"};
        String [] time = {"10", "12", "14", "16", "18", "20"};
        String [] place = {"school", "shop", "church", "gym", "cinema", "clinic"};

        System.out.println("Please, enter the first number");
        int number1 = scanner.nextInt();

        System.out.println("Please, enter the second number");
        int number2 = scanner.nextInt();

        System.out.println("Please, enter the third number");
        int number3 = scanner.nextInt();

        System.out.println(names[number1] + " will go to the " + place[number3] + " at " + time[number2] + ":00");
    }
}
