package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution5_2 {

    public static int solution(int N) {
        int answer = 0;
        int cnt = 1;
        N--;

        while (N > 0) {
            cnt++;
            N = N - cnt;
            if (N % cnt == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        System.out.println(solution(N));
    }
}
