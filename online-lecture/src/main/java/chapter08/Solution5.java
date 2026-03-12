package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution5 {

    static int N, coin;
    static int answer = Integer.MAX_VALUE;
    static Integer[] arr;

    static void DFS(int L, int sum) {
        if ((sum > coin) || (L >= answer)) return;

        if (sum == coin) {
            answer = L;
            return;
        }

        for (int i = 0; i < N; i++) {
            DFS(L + 1, sum + arr[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        coin = Integer.parseInt(br.readLine());

        DFS(0, 0);
        System.out.println(answer);
    }
}
