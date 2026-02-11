package chapter05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution4_1 {

    public static int solution(String str) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(char ch: str.toCharArray()) {
            if(Character.isDigit(ch)) stack.push(ch - '0');
            else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = 0;

                if(ch == '+') result = (num1 + num2);
                if(ch == '-') result = (num1 - num2);
                if(ch == '*') result = (num1 * num2);
                if(ch == '/') result = (num1 / num2);

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}
