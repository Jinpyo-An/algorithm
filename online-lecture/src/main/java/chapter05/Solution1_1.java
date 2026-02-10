package chapter05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1_1 {

    public static String solution(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char ch: str.toCharArray()) {
            if(ch == '(') stack.push(ch);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";

        return "YES";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
