package chapter06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution3_1 {

    public static int[] solution(int N, int[] arrN) {
        for (int i = 1; i < N; i++) {
            int tmp = arrN[i];
            int j;

            for (j = i - 1; j >=0; j--) {
                if (arrN[j] > tmp) arrN[j + 1] = arrN[j];
                else break;
            }

            arrN[j + 1] = tmp;
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
