package chapter01;

import java.util.Scanner;

public class Solution2_2 {

    public String solution(String str) {
        String answer = "";

        for (char ch: str.toCharArray()) {
            if (Character.isLowerCase(ch)) answer += Character.toUpperCase(ch);
            else answer += Character.toLowerCase(ch);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2_2 T = new Solution2_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
