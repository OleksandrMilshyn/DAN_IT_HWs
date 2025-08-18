package java_hw_4.task1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phrase = "";

        while (true) {
            System.out.println("Hello. Say something");
            String program = scanner.nextLine();
            if (program.equals("Stop")) {
                System.out.println(phrase);
                return;
            }
            phrase += program + " ";
        }
    }
}
