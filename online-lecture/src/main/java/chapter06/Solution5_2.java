package chapter06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution5_2 {

    public static String solution(int N, int[] arrN) {
        Arrays.sort(arrN);

        for (int i = 0; i < N - 1; i++) {
            if (arrN[i] == arrN[i + 1]) return "D";
        }

        return "U";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, arrN));
    }
}
