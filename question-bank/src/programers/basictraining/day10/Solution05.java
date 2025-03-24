/**
 * 문자열 code, 두 정수 q, r
 * code의 각 인덱스를 q로 나누었을 때, 나머지가 r인 위치의 문자를 순서대로 이어붙인 문자열 return
 *
 * 문자를 이어붙일 builder 변수
 * 
 */

package programers.basictraining.day10;

public class Solution05 {
    
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (r == (i % q)) {
                answer.append(code.charAt(i));
            }
        }

        return answer.toString();
    }
}
