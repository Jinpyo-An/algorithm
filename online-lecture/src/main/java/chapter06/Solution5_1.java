package chapter06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution5_1 {

    public static String solution(int N, int[] arrN) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arrN[i] == arrN[j]) return "D";
            }
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
