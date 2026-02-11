package chapter05;

import java.io.*;
import java.util.*;

public class Solution5_1 {

    public static int solution(String str) {
        int answer = 0;
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
