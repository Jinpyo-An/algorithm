package chapter06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution8_1 {

    public static int solution(int N, int M, int[] arr) {
        int left = 0;
        int right = N - 1;

        Arrays.sort(arr);

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == M) return mid + 1;
            else if(arr[mid] < M) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, M, arr));
    }
}
