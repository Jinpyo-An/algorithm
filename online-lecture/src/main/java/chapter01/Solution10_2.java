package chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1. 문자열에 해당 문자가 위치한 인덱스 정보를 구한다.
 * 2. 문자열을 순회한다.
 *    2-1. 문자의 인덱스와 주어진 문자의 차이가 가자 적은 값을 저장한다.
 * 3. 최소거리가 구해진 배열을 반환한다.
 */

public class Solution10_2 {

    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        p = 1000;
        for (int i = s.length()  - 1; i >= 0 ; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char t = scanner.next().charAt(0);
        for (int i : solution(s, t)) {
            System.out.print(i + " ");
        }
    }
}
