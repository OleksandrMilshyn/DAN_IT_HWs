package java_hw_8.task2;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Vasya", "Vetrov", 20);
        Person person2 = new Person("Vasya", "Vetrov", 20);
        Person person3 = new Person("Vera", "Vasiljeva", 18);
        Person person4 = new Person("Vera", "Vasiljeva", 18);
        Person person5 = new Person("Sania", "Schustry", 21);
        Person person6 = new Person("Sofia", "Abstractna", 22);

        Set<Person> personsSet = new HashSet<>();
        personsSet.add(person1);
        personsSet.add(person2);
        personsSet.add(person3);
        personsSet.add(person4);
        personsSet.add(person5);
        personsSet.add(person6);

        System.out.println(personsSet);
        System.out.println("Size of Set collection: " + personsSet.size());
        System.out.println("Remove an element: " + personsSet.remove(person3));
        System.out.println(personsSet);
        System.out.println("Check an element: " + personsSet.contains(person3));
        System.out.println(personsSet);
    }
}
