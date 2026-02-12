package chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution7_1 {

    public static String solution(String str1, String str2) {
        Deque<Character> queue = new ArrayDeque<>();

        for (char c : str1.toCharArray()) {
            queue.offer(c);
        }

        for (char c : str2.toCharArray()) {
            if (!queue.isEmpty() && c == queue.peek()) {
                queue.poll();
            }
        }

        return queue.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution(str1, str2));
    }
}
