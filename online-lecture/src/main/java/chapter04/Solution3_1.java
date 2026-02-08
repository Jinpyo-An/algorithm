package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution3_1 {

    public static List<Integer> solution(int N, int K, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i <= N - K; i++) {
            Set<Integer> set = new HashSet<>();

            for(int j = i; j < i + K; j++) {
                set.add(arr[j]);
            }

            answer.add(set.size());
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (Integer i: solution(N, K, arr)) {
            System.out.print(i + " ");
        }
    }
}
