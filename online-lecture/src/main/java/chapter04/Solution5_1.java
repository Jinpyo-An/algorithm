package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution5_1 {

    public static int solution(int N, int K, int[] arrN) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    set.add(arrN[i] + arrN[j] + arrN[k]);
                }
            }
        }

        if (set.size() < K) return -1;

        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());

        return list.get(K - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, K, arrN));
    }
}
