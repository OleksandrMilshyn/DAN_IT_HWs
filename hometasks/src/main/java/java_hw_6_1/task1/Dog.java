package java_hw_6_1.task1;

public class Dog extends Animal{

    @Override
    public void eat() {
        super.eat();
        System.out.println("But I am a dog, also I bark");
    }
}
