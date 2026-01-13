package chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution4_3 {

    public List<String> solution(String[] str) {
        List<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = s.length - 1;

            while (lt < rt) {
                char tmp;
                tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            answer.add(String.valueOf(s));
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution4_3 T = new Solution4_3();
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
