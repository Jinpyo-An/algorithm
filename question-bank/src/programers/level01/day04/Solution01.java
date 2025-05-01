/*
입력: 전화번호 문자열 phoneNumber

문자열 phoneNumber의 뒷자리 4개를 제외한 나머지 숫자를 *로 변환한다.
문자열 길이에 4개를 뺀 길이를 구한다.
1. 위 길이 만큼 *를 만든다.
2. 뒤 4자리를 subString 한다.
1, 2를 더한 값을 리턴한다.
 */

package programers.level01.day04;

public class Solution01 {

    public String solution(String phoneNumber) {
        String front = "*";
        int frontLength = phoneNumber.length() - 4;
        String frontRepeat = front.repeat(frontLength);
        String end = phoneNumber.substring(phoneNumber.length() - 4);

        return frontRepeat + end;
    }
}
