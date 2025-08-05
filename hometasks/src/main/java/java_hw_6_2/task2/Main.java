package java_hw_6_2.task2;

public class Main {

    public static void main(String[] args) {
        String textMain = " I am typing some text. It is not difficult. ";

        ReverseProcessor reverseProcessor = new ReverseProcessor();
        TrimProcessor trimProcessor = new TrimProcessor();
        UpperCaseProcessor upperCaseProcessor = new UpperCaseProcessor();

        System.out.println(reverseProcessor.process(textMain));
        System.out.println(reverseProcessor.removeDigits(textMain));

        System.out.println(trimProcessor.process(textMain));
        System.out.println(trimProcessor.removeDigits(textMain));

        System.out.println(upperCaseProcessor.process(textMain));
        System.out.println(upperCaseProcessor.removeDigits(textMain));

    }
}
