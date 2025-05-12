/*
try hello world
TrY HeLlO WoRlD

변환된 문자를 담을 스트링 빌더 변수 선언 sb
인덱스를 확인할 변수 선언 index
문자열 s를 모든 원소마다 순회
공백일 시, 그냥 원소를 담고 index변수를 0으로 초기화한다.
공백이 아닐 시, 인덱스를 확인하여 문자를 변환한 후 담는다.
 */

package programers.level01.day08;

public class Solution02 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                answer.append(s.charAt(i));
            } else {
                if (index % 2 == 0) {
                    answer.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    answer.append(Character.toLowerCase(s.charAt(i)));
                }
                index++;
            }
        }

        return answer.toString();
    }
}
