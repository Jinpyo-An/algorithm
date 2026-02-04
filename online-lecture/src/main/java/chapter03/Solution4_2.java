package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4_2 {

    public static int solution(int N, int M, int[] arrN){
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < N; rt++) {
            sum += arrN[rt];
            if (sum == M) answer++;
            while (sum >= M) {
                sum -= arrN[lt++];
                if (sum == M) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arrN = new int[N];
        for(int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, M, arrN));
    }
}
