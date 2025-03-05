package chapter06;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test2 {

    public static String solution(int decimal) {
        Deque<Integer> stack = new ArrayDeque<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        final StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
