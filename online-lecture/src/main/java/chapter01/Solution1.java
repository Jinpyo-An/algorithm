package chapter01;

import java.util.Scanner;

/**
 * 1. 문자열을 순회한다.
 * 2. 문자와 같은 문자가 나오면, 카운트한다.
 * 3. 카운트한 값을 반환한다.
 */
public class Solution1 {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char ch : str.toCharArray()) {
            if (ch == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution1 T = new Solution1();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
