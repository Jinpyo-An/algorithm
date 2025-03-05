package chapter06;

import java.util.Stack;

public class MyStack2 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(5);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.size());
        stack.push(7);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
