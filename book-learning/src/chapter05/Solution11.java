/*
1. 문자열 str의 각 문자를 스택에 넣는다.
2. 스택에 원소가 2개 이상일 때, top과 그 전 원소가 같은 문자인지 확인한다.
   2-1. 만약 같다면, 두 원소를 pop한다.
   2-2. 같지 않다면, 다음으로 넘어간다.
 */

package chapter05;

import java.util.ArrayDeque;
import java.util.Stack;

public class Solution11 {

    public static int solution01(String str) {
        Stack<Character> stack = new Stack<>();

        for (Character c : str.toCharArray()) {
            stack.push(c);

            if (stack.size() >= 2) {
                if (stack.peek() == stack.get(stack.size() - 2)) {
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static int solution02(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {

            // 1. 스택이 비어 있지 않고, 현재 무자와 스택의 맨 위 문자가 같으면
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 2. 스택의 맨 위 문자 제거
            } else {
                stack.push(c); // 3. 스택에 현재 문자 추가
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
