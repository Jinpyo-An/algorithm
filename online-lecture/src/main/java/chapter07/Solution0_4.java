package chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution0_4 {

    public static int[] solution(int N) {
        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < N; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]);
        }

        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int x : solution(N)) {
            System.out.print(x + " ");
        }
    }
}
