package chapter06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static int solution(String s) {
        // 1. 괄호 정보를 저장
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int n = s.length(); // 원본 문자열의 길이 저장
        s += s; // 원본 문자열 뒤에 원본 문자열을 이어 붙여 2번 나오도록 만듦
        int answer = 0;

        // 2. 확인할 문자열의 시작 인덱스를 0부터 n까지 이동
        A:for (int i = 0; i < n; i++) {
            Deque<Character> stack = new ArrayDeque<>();

            // 3. i(시작 위치)부터 원본 문자열의 길이인 n개까지 올바른 괄호 문자열인지 확인
            for (int j = i; j < i + n; j++) {
                char c = s.charAt(j);
                // 해시맵 안에 해당 키가 없다면 열리는 괄호임
                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    // 4. 짝이 맞지 않으면 내부 for문을 종료하고 for문 A로 이동
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                        continue A;
                    }
                }
            }
            // 5. 3에서 continue 되지 않았고, 스택이 비어 있으면 올바른 괄호 문자열
            if (stack.isEmpty()) answer++;
        }

        return answer;
    }
}
