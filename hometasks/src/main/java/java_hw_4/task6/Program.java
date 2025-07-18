package java_hw_4.task6;

public class Program {

    public static void main(String[] args) {
        int[] array = new int[45]; //создаю массив
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101) - 50;// заполняю массив рандомными числами
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // передаю минимальное значение элементу
            } else if (array[i]>max) {
                max = array[i];  // передаю максимальное значение элементу
            }

        }
        System.out.println("The minimum element in an array is " + min);
        System.out.println("The maximum element in an array is " + max);
    }
}
