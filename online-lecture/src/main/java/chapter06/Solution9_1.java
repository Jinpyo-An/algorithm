package chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution9_1 {

    public static int count(int[] arr, int capacity) {
        int count = 1;
        int sum = 0;

        for (int x : arr) {
            if (sum + x > capacity) {
                count++;
                sum = x;
            } else sum += x;
        }

        return count;
    }

    public static int solution(int N, int M, int[] arr) {
        int answer = 0;
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();

        while (left <= right) {
            int mid = (left + right) / 2;

            if (count(arr, mid) <= M) {
                answer = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N, M, arr));
    }
}
