package chapter06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution6_1 {

    public static List<Integer> solution(int N, int[] arrN) {
        List<Integer> answer = new ArrayList<>();
        int[] arrN2 = arrN.clone();
        Arrays.sort(arrN2);

        for (int i = 0; i < N; i++) {
            if (arrN[i] != arrN2[i]) answer.add(i + 1);
            if (answer.size() == 2) break;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        for (Integer i : solution(N, arrN)) {
            System.out.print(i + " ");
        }
    }
}
