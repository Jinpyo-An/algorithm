package chapter07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MyArrayDeque2 {

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        int first = queue.pollFirst();
        System.out.println(first);

        queue.addLast(4);
        queue.addLast(5);

        first = queue.pollFirst();
        System.out.println(first);
    }
}
