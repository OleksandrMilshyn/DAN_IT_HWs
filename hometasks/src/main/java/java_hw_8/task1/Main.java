package java_hw_8.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Person> arrayPeople = new HashMap<>();

        while (true){
            System.out.println("Hello. What do you want?) To getPerson, to addPerson or exit?");
            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase("getPerson")){
                if (arrayPeople.isEmpty()) {
                    System.out.println("The list of empty");
                } else {
                    System.out.println("Please, provide the surname.");
                    String callSurname = scanner.next().toUpperCase();
                    if (arrayPeople.containsKey(callSurname)){
                        System.out.println(arrayPeople.get(callSurname));
                } else {
                        System.out.println("That surname is not on the list. Here is the complete list: " + arrayPeople.keySet());
                    }
                }
            } else if (userAnswer.equalsIgnoreCase("addPerson")){
                System.out.println("Please, provide the surname");
                String callSurname = scanner.next().toUpperCase();
                System.out.println("Please, provide the name");
                String name = scanner.next();
                int age;
                while (true) {
                    System.out.println("Please, provide the age");
                    if (scanner.hasNextInt()) {
                        age = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Age must be a number!");
                        scanner.next();
                    }
                }

                if (arrayPeople.containsKey(callSurname)){
                    System.out.println("This surname already exists: " + arrayPeople.get(callSurname));
                    System.out.println("Do you want to replace it? (yes/no)");
                    String confirm = scanner.next();
                    if (!confirm.equalsIgnoreCase("yes")) {
                        System.out.println("Not replaced.");
                        continue;
                    }
                }
                arrayPeople.put(callSurname, new Person(name, callSurname, age));
                System.out.println("Person added/updated.");

            } else if (userAnswer.equalsIgnoreCase("exit")){
                System.out.println("OK. Whatever you want.");
                break;
            } else {
                System.out.println("Unknown operation, please try again.");
            }
        }
    }
}
