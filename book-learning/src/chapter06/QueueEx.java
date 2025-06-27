package chapter06;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        int first = queue.poll();
        System.out.println(first);

        queue.add(4);
        queue.add(5);

        first = queue.poll();
        System.out.println(first);

        ArrayDeque<Integer> queue2 = new ArrayDeque<>();

        queue2.addLast(1);
        queue2.addLast(2);
        queue2.addLast(3);

         Integer first1 = queue2.pollFirst();
        System.out.println(first1);

        queue2.addLast(4);
        queue2.addLast(5);

        first1 = queue2.pollFirst();
        System.out.println(first1);
    }
}
