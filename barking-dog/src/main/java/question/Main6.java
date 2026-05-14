/**
 * 1. 단어를 순회 한다.
 * 2. 알파벳이 무엇인지 확인하고 해당 배열의 원소 값을 증가시킨다.
 * 3. 정답 배열을 리턴한다.
 */

package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {

    public static void solution(String S) {
        int[] answer = new int[26];

        for (char c : S.toCharArray()) {
            answer[c - 'a']++;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        solution(S);
    }
}
