package chapter01;

import java.util.Scanner;

public class Solution2_3 {

    public String solution(String str) {
        String answer = "";

        for (char ch: str.toCharArray()) {
            if (ch >= 97) answer += (char) (ch - 32);
            else answer += (char) (ch + 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2_3 T = new Solution2_3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
