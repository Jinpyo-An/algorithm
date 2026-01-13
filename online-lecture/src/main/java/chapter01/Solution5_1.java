package chapter01;

import java.util.Scanner;

public class Solution5_1 {

    public String solution(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        char[] s = str.toCharArray();

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(s);
    }

    public static void main(String[] args) {
        Solution5_1 T = new Solution5_1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}
