package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution5_1 {

    public static int solution(int N) {
        int count = 0;
        int sum = 0;
        int lt = 1;

        for(int rt = 1; rt <= (N + 1) / 2; rt++) {
            sum += rt;
            if (sum == N) count++;
            while(sum >= N) {
                sum -= lt++;
                if(sum == N) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        System.out.println(solution(N));
    }
}
