package java_hw_9.task3;

public class AnimalFactory {

    public static Animal createAnimal(String animalType) {
        switch (animalType){
            case "bird":
                return new Bird();
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                System.out.println("There is no such kind of animal: " + animalType);
                return null;
        }
    }
}
