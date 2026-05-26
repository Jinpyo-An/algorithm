package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main22 {

    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    static void hanoi(int a, int b, int n) {
        if (n == 1) {
            sb.append(a).append(" ").append(b).append("\n");
            count++;
            return;
        }

        hanoi(a, 6 - a - b, n - 1);
        sb.append(a).append(" ").append(b).append("\n");
        count++;
        hanoi(6 - a - b, b, n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        hanoi(1, 3, N);

        System.out.println(count);
        System.out.println(sb);
    }
}
