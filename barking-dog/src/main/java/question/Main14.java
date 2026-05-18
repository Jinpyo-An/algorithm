package question;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main14 {

    public static Deque<Integer> deque = new ArrayDeque<>();

    public static void push_front(int x) {
        deque.addFirst(x);
    }

    public static void push_back(int x) {
        deque.addLast(x);
    }

    public static int pop_front() {
        if (deque.isEmpty()) return -1;
        return deque.removeFirst();
    }

    public static int pop_back() {
        if (deque.isEmpty()) return -1;
        return deque.removeLast();
    }

    public static int size() {
        return deque.size();
    }

    public static int empty() {
        if (deque.isEmpty()) return 1;
        else return 0;
    }

    public static int front() {
        if (deque.isEmpty()) return -1;
        else return deque.getFirst();
    }

    public static int back() {
        if (deque.isEmpty()) return -1;
        else return deque.getLast();
    }
}
