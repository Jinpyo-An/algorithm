/*
문자열 길이가 짝수 일 때
- 문자열 길이를 2로 나눈다.
- 나눈 값의 인덱스와 그 앞 인덱스의 까지의 문자열 반환
문자열 길이가 홀수 일 때
- 문자열 길이를 2로 나누고 (int)로 타입 캐스팅 한 인덱스 문자열을 반환
 */

package programers.level01.day04;

public class Solution02 {

    public String solution(String s) {
        int middleIndex = s.length() / 2;
        if (s.length() % 2 == 0) {
            return s.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return String.valueOf(s.charAt(middleIndex));
        }
    }
}
