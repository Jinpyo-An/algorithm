package chapter06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1_1 {

    public static int[] solution(int N, int[] arrN) {
        for(int i = 0; i < N - 1; i++) {
            int minIdx = i;

            for(int j = i + 1; j < N; j++) {
                if(arrN[j] < arrN[minIdx]) {
                    minIdx = j;
                }
            }

            int tmp = arrN[i];
            arrN[i] = arrN[minIdx];
            arrN[minIdx] = tmp;
        }

        return arrN;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        for(int i: solution(N, arrN)) {
            System.out.print(i + " ");
        }
    }
}
