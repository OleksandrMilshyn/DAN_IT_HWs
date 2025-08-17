package java_hw_6_2.task2;

public interface TextProcessor {

    String process(String text);

    default String removeDigits(String text){
        return text.replace(".", "");
    }

}
