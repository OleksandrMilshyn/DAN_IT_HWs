package java_hw_9.task3;

public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
