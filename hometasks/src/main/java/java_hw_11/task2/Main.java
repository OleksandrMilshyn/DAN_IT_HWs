package java_hw_11.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Vasiliy", "Vetrov", 72, 1000);
        Person person2 = new Person("Vitaliy", "Antonov", 82, 1500);
        Person person3 = new Person("Vika", "Ambroskina", 19, 800);
        Person person4 = new Person("Angela", "Vladimirova", 50, 2500);
        Person person5 = new Person("Prosto", "Chelovek", 27, 3000);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println(persons);

        List<String> finalList = persons.stream()
                .filter(person -> person.getAge() < 70)
                .map(Person::getName)
                .toList();
        System.out.println(finalList);
    }
}
