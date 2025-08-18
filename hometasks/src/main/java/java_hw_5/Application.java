package java_hw_5;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        NumbersApplication start = new NumbersApplication(name);
        System.out.println("Let the game begin!");
        start.startGame(scanner);
    }
}
