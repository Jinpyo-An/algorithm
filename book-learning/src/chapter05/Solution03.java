/*
1. 올바른 괄호 문자열 x의 개수를 카운트할 변수 xCount를 선언한다.
2. 0번 회전했을 때(원본 s) 올바른 괄호 문자열인지 판단한다.
   2-1. 올바른 괄호 문자열이면 xCount를 증가시킨다.
   2-2. 올바른 괄호 문자열이 아니면 xCount를 증가시키지 않는다.
3. 1부터 s-1번까지 다음 작업을 반복한다.
   3-1. 한칸 회전한다.
   3-2. 회전한 문자열이 올바른 괄호 문자열인지 판단한다.
        3-2-1. 올바른 괄호 문자열이면 xCount를 증가시킨다.
   3-3. 회전한 문자열을 s에 대입한다.
 */

package chapter05;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Solution03 {

    public static int solution(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int n = s.length();
        s += s;
        int answer = 0;

        A: for (int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for (int j = i; j < i + n ; j++) {
                char c = s.charAt(j);
                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                        continue A;
                    }
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
