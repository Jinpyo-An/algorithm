package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4_1 {

    public static int solution(int N, int M, int[] arrN){
        int count = 0;

        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = i; j < N; j++){
                sum += arrN[j];
                if(sum == M) {
                    count++;
                    break;
                } else if(sum > M) break;
            }
        }

        return count;
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
