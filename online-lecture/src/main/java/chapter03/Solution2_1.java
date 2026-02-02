package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution2_1 {

    public static List<Integer> solution(int N, int[] arrN, int M, int[] arrM){
        List<Integer> answer = new ArrayList<Integer>();
        int p1 = 0, p2 = 0;
        Arrays.sort(arrN);
        Arrays.sort(arrM);

        while(p1 < N && p2 < M){
            if(arrN[p1] == arrM[p2]) {
                answer.add(arrN[p1]);
                p1++;
                p2++;
            }
            else if(arrN[p1] < arrM[p2]) p1++;
            else p2++;
        }

        return answer;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> answer = solution(N, arrN, M, arrM);
        for(Integer i: answer){
            System.out.print(i + " ");
        }
    }
}
