package java_hw_2.task3;

public class Main {
    public static void main(String[] args) {
        String mainText = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        String mainTextLower = mainText.toLowerCase();
        int sizeText = mainTextLower.length();
        String variableTask = "a";
        int countA = 0;
        String[] symbols = mainTextLower.split("");
        for (int i = 0; i < sizeText; i++) {
            if (symbols[i].equals(variableTask))
                countA += 1;
        }
        System.out.println(countA);
    }
}
