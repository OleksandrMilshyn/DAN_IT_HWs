package java_hw_9.task3;

public class Bird implements Animal{
    @Override
    public void speak() {
        System.out.println("Chirp!");
    }

    @Override
    public String toString() {
        return "Bird";
    }
}
