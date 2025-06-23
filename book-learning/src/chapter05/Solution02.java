/*
1. 만약 decimal이 1이면 1을 반환한다.
2. 이진수를 담을 stack을 선언한다.
3. decimal이 1보다 클 때까지 다음 작업을 반복한다.
   3-1. decimal을 2로 나누어 나머지를 stack에 push한다.
4.
 */

package chapter05;

import java.util.ArrayDeque;

public class Solution02 {

    public static String solution(int decimal) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }

        StringBuilder answer = new StringBuilder();

        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }

        return answer.toString();
    }
}
