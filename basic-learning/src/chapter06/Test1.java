package chapter06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Test1 {

    private static boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        char[] a = s.toCharArray();
        for (char c : a) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();
        final boolean answer = solution(input);
        System.out.println(answer);
    }
}
