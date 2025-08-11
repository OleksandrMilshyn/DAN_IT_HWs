package java_hw_8.task3.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main  {

    public static void main(String [] arg){
        Queue<String> queue = new LinkedList<>();
        System.out.println("Output an empty list: " + queue);

        System.out.println("Output an empty list with .peek(): " + queue.peek());

        queue.offer("Vasya");
        queue.offer("Petya");
        queue.offer("Serhii");

        System.out.println("Output a collection of three elements: " + queue);
        System.out.println("The size of collection is: " + queue.size());
        System.out.println("Output the first element: " + queue.element());

        System.out.println("Output the first element and delete it: " + queue.remove());
        queue.remove();

        System.out.println("Output the first element and delete it with .poll(): " + queue.poll());
        System.out.println("Output an empty list with .poll(): " + queue.poll());

    }

}
