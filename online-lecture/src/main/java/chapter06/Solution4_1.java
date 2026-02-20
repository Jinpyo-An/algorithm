package chapter06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4_1 {

    public static int[] solution(int S, int N, int[] arrN) {
        int[] cache = new int[S];

        for(int x : arrN) {
            int pos = -1;
            for(int i = 0; i < S; i++){
                if(x == cache[i]) pos = i;
            }
            if(pos == -1) {
                for(int i = S - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            else {
                for(int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : solution(S, N, arrN)) {
            if (i == 0) break;
            System.out.print(i + " ");
        }
    }
}
