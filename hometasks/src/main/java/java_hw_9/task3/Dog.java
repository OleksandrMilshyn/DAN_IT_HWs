package java_hw_9.task3;

public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
