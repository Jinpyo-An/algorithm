package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main9 {

    public static void main(String[] args) throws IOException {
        Deque<Character> leftStack = new ArrayDeque<>();
        Deque<Character> rightStack = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (char c : s.toCharArray()) {
            leftStack.push(c);
        }

        int i = Integer.parseInt(br.readLine());

        for (int j = 0; j < i ; j++) {
            String command = br.readLine();
            char c1 = command.charAt(0);

            if (c1 == 'L') {
                if (!leftStack.isEmpty()) rightStack.push(leftStack.pop());
            }
            else if (c1 == 'D') {
                if (!rightStack.isEmpty()) leftStack.push(rightStack.pop());
            }
            else if (c1 == 'B') {
                if (!leftStack.isEmpty()) leftStack.pop();
            }
            else leftStack.push(command.charAt(2));
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : leftStack) {
            sb.append(c);
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }
}
