package java_hw_5;

import java.util.Scanner;

public class NumbersApplication {

    private String name;

    private int gameNumber;

    public NumbersApplication(String name) {
        this.name = name;
        this.gameNumber = (int) (Math.random() * 101);
    }

    public void startGame(Scanner scanner){
        while (true){
            System.out.println("Please enter a number from 0 to 100");
            int numberOfUser = scanner.nextInt();
            if (numberOfUser == gameNumber){
                System.out.println("Congratulations, " + this.name + " !");
                break;
            }else if (numberOfUser > gameNumber){
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Your number is too small. Please, try again.");
            }
        }
    }
}


