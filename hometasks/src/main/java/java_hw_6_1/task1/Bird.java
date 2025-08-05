package java_hw_6_1.task1;

public class Bird extends Animal{

    @Override
    public void eat() {
        super.eat();
        System.out.println("But I am a bird, also I fly");
    }
}
