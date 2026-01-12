package chapter01;

import java.util.Scanner;

public class Solution3_2 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Solution3_2 T = new Solution3_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
