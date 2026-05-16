package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11 {

    static int[] stack = new int[10005];
    static int pos = 0;

    public static void push(int x) {
        stack[pos++] = x;
    }

    public static void pop() {
        if (pos > 0) System.out.println(stack[--pos]);
        else System.out.println(-1);
    }

    public static void size() {
        System.out.println(pos);
    }

    public static void empty() {
        if (pos == 0) System.out.println(1);
        else System.out.println(0);
    }

    public static void top() {
        if (pos > 0) System.out.println(stack[pos - 1]);
        else System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int val = Integer.parseInt(st.nextToken());
                push(val);
            } else if (cmd.equals("pop")) {
                pop();
            } else if (cmd.equals("size")) {
                size();
            } else if (cmd.equals("empty")) {
                empty();
            } else {
                top();
            }
        }
    }
}
