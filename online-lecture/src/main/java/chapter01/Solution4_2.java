package chapter01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution4_2 {

    public List<String> solution(String[] str) {
        List<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution4_2 T = new Solution4_2();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = scanner.next();
        }

        for (String x : T.solution(str)) {
            System.out.println(x);
        }
    }
}
