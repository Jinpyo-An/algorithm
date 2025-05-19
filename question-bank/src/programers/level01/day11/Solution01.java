/*
입력 값: 문자열로 구성된 리스트 strings, 정수 n
각 문자열 인덱스 n번쨰 글자 기준으로 오름차순 정렬
해당 인덱스의 문자가 여럿 일 경우, 사전순으로 정렬

기준으로 그룹을 만든다.
그룹별로 사전순으로 정렬한다.
그룹들을 기준으로 붙인다.
해당 결과를 리턴한다.
 */

package programers.level01.day11;

import java.util.Arrays;

public class Solution01 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            } else {
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
        });

        return strings;
    }

    public String[] solution02(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] temp = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strings[i].charAt(n));
            sb.append(strings[i]);
            temp[i] = sb.toString();
        }

        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            answer[i] = temp[i].substring(1);
        }

        return answer;
    }
}
