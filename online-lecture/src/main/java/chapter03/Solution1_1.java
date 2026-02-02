package chapter03;

import java.io.*;
import java.util.*;

public class Solution1_1 {

    public static List<Integer> solution(int N, int[] arrN, int M, int[] arrM) {
        List<Integer> answer = new ArrayList<>();

        for(int i: arrN){
            answer.add(i);
        }
        for(int i: arrM){
            answer.add(i);
        }

        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> answer = solution(N, arrN, M, arrM);
        for(Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}
