/**
 * 문자열 my_string
 * 알파벳 개수를 순서대로 담은 길이 52의 정수 배열 return
 *
 * 65 ~ 90 대문자
 * 97 ~ 122 소문자
 *
 * 1. 길이가 52인 정수 배열 선언
 * 2. 각 알파벳을 인코딩
 * 3. 대문자일 경우
 *    - 인코딩한 값에 65를 뺀 인덱스의 값을 증가
 * 4. 소문자일 경우
 *    - 인코딩한 값에 71을 뺀 인덱스의 값을 증가
 */

package programers.basic_training.day11;

public class Solution01 {

    public int[] solution(String myString) {
        int[] answer = new int[52];

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (Character.isUpperCase(c)) {
                answer[((int) c) - 65]++;
            } else answer[((int) c) - 71]++;
        }

        return answer;
    }
}
