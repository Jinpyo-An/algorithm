package chapter05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2_1 {

    public static String solution(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()) {
            if(ch == ')') {
                while(true) {
                    char result = deque.pop();
                    if(result == '(') break;
                }
            } else deque.push(ch);
        }

        for(char ch: deque) sb.append(ch);

        return sb.reverse().toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
