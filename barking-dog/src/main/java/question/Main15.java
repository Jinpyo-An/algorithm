package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main15 {

    public static void solution(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == ')') {
                if (deque.isEmpty() || deque.peek() != '(') {
                    System.out.println("no");
                    return;
                }
                deque.pop();
            } else if (c == ']') {
                if (deque.isEmpty() || deque.peek() != '[') {
                    System.out.println("no");
                    return;
                }
                deque.pop();
            }
        }

        if (deque.isEmpty()) System.out.println("yes");
        else System.out.println("no");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) break;

            solution(str);
        }
    }
}
