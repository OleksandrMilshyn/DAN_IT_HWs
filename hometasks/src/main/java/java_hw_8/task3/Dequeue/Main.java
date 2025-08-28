package java_hw_8.task3.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String [] arg) {
        Deque<String> deque = new ArrayDeque<>();
        System.out.println("Add an item to the collection");
        deque.add("One");
        System.out.println("deque collection is: " + deque);
        deque.addFirst("Two");
        System.out.println("In Deque we can add an element to the beginning: " + deque);
        deque.addLast("Three");
        System.out.println("and to the end: " + deque);
        System.out.println("call the first element: " + deque.getFirst());
        System.out.println("call the last element: " + deque.getLast());
        System.out.println("return the first element without delete (and null if deque is Empty): " + deque.peekFirst());
        System.out.println("return the last element without delete (and null if deque is Empty): " + deque.peekLast());
        System.out.println("return the first element and delete it (without exception if the collection is empty): " + deque.pollFirst());
        System.out.println("return the last element and delete it (without exception if the collection is empty): " + deque.pollLast());
        System.out.println("the collection without the first and the last element: " + deque);
        System.out.println("return the first element and delete it (with exception if the collection is empty): " + deque.pop());
        deque.addLast("One");
        deque.addLast("Two");
        deque.addLast("Three");
        deque.addLast("Four");
        deque.addLast(("Two"));
        deque.addLast("Five");
        deque.addLast("Two");
        System.out.println(deque);
        System.out.println("Delete the first occurrence: " + deque.removeFirstOccurrence("Two"));
        System.out.println(deque);
        System.out.println("Delete the last occurrence: " + deque.removeLastOccurrence("Two"));
        System.out.println(deque);
        System.out.println(getSpecificValue(deque,2));

    }
    public static String getSpecificValue(Deque<String> deque, int index){
        String result = null;
        int currentIndex = 0;
        for (String value : deque) {
            if (currentIndex == index){
                result = value;
                break;
            }
            currentIndex ++;
        }
        return result;
    }
}
