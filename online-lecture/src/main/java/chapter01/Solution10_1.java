package chapter01;

import java.util.*;

/**
 * 1. 문자열에 해당 문자가 위치한 인덱스 정보를 구한다.
 * 2. 문자열을 순회한다.
 *    2-1. 문자의 인덱스와 주어진 문자의 차이가 가자 적은 값을 저장한다.
 * 3. 최소거리가 구해진 배열을 반환한다.
 */

public class Solution10_1 {

    public static int[] solution(String s, char t) {
        List<Integer> tIndex = new ArrayList<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) tIndex.add(i);
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                answer[i] = 0;
                continue;
            }

            List<Integer> dis = new ArrayList<>();
            for (Integer index : tIndex) {
                dis.add(Math.abs(index - i));
            }

            answer[i] = Collections.min(dis);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char t = scanner.next().charAt(0);
        int[] answer = solution(s, t);

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
