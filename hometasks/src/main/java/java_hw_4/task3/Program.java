package java_hw_4.task3;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. This is a metal warehouse.");
        int warehouseVolume = 0;
        int maxCapacity = 100;

        while (warehouseVolume < maxCapacity) {
            System.out.println("How many kilograms would you like to leave?");
            int numberOfKilo = scanner.nextInt();
            int remainingSpace = maxCapacity - warehouseVolume;
            if (numberOfKilo < 5) {
                System.out.println("This is not enough. Put more.");
                continue;
            } else if (numberOfKilo > remainingSpace) {
                System.out.println("This is too much. You can only add " + remainingSpace + " kilograms.");
                continue;
            } else if ((remainingSpace - numberOfKilo < 5) && (remainingSpace - numberOfKilo != 0)) {
                System.out.println("You can't leave that much metal — the remainder must be at least 5 kg or exactly 0.");
                continue;
            }
            warehouseVolume += numberOfKilo;

            if (warehouseVolume == maxCapacity) {
                System.out.println("The warehouse is full. No more space. The warehouse is closed!");
                break;
            } else {
                System.out.println("Accepted. Remaining space: " + (maxCapacity - warehouseVolume) + " kilograms.");
            }
        }
        scanner.close();
    }
}