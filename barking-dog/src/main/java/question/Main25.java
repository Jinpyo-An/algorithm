package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25 {

    static boolean[] isUsed1 = new boolean[40];
    static boolean[] isUsed2 = new boolean[40];
    static boolean[] isUsed3 = new boolean[40];
    static int cnt = 0;
    static int n;

    static void func(int x) {
        if (x == n) {
            cnt++;
            return;
        }

        for (int y = 0; y < n; y++) {
            if (isUsed1[y] || isUsed2[x + y] || isUsed3[x - y + n + 1]) continue;

            isUsed1[y] = true;
            isUsed2[y + x] = true;
            isUsed3[x - y + n + 1] = true;

            func(x + 1);

            isUsed1[y] = false;
            isUsed2[y + x] = false;
            isUsed3[x - y + n + 1] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        func(0);
        System.out.println(cnt);
    }
}
