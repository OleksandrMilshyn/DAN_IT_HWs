package java_hw_9.task3;

import static java_hw_9.task3.AnimalFactory.createAnimal;

public class Main {

    public static void main(String[] args) {
        Animal cat = createAnimal("cat");
        Animal bird = createAnimal("bird");
        Animal dog = createAnimal("dog");

        cat.speak();
        dog.speak();
        bird.speak();
    }
}
