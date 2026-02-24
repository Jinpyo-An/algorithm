package chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution10 {

    public static int batch(int[] arr, int maxLength) {
        int count = 1;
        int tmp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - tmp >= maxLength) {
                count++;
                tmp = arr[i];
            }
        }

        return count;
    }

    public static int solution(int N, int C, int[] arr) {
        int answer = 0;
        int left = 1;
        int right = arr[arr.length - 1] - arr[0];

        while (left <= right) {
            int mid = (left + right) / 2;

            if (batch(arr, mid) >= C) {
                answer = mid;
                left = mid + 1;
            } else right = mid - 1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(solution(N, C, arr));
    }
}
