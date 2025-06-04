/*
s를 문자 배열 sToCharArr, skip을 문자 배열 skipToCharArr로 만든다.
1. 문자열 s의 모든 문자를 순차적으로 순회
   for(i = 0; sToCharArr.length; i++)
   1-1. 바꾸는 횟수를 카운트하는 count 변수 선언
        count = 0;
   1-2. 해당 문자에 대해서 index만큼 바꾸는 작업
        while(count <= index)
        1-2-1. sToCharArr[i]를 1더한다.
               더한 결과 문자가 z이면 a로 변환한다.
        1-2-1. 더한 결과 문자가 skipToCharArr에 있는지 검사합니다.
               있으면 count를 증가시키지 않는다.
               없으면 count를 증가시킨다.

 */
package programers.level01.day17;

import java.util.HashSet;
import java.util.Set;

public class Solution01 {

    public String solution01(String s, String skip, int index) {
        char[] sToCharArr = s.toCharArray();
        char[] skipToCharArr = skip.toCharArray();

        for (int i = 0; i < sToCharArr.length; i++) {
            int count = 0;

            while (count < index) {
                sToCharArr[i] = (char) (sToCharArr[i] + 1);
                boolean bool = false;

                if (sToCharArr[i] > 'z') {
                    sToCharArr[i] = 'a';
                }

                for (char c : skipToCharArr) {
                    if (sToCharArr[i] == c) {
                        bool = true;
                        break;
                    }
                }

                if (bool) continue;

                count++;
            }
        }

        return String.valueOf(sToCharArr);
    }

    public String solution02(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int count = 0;
            char current = ch;

            while (count < index) {
                current++;

                if (current > 'z') {
                    current = 'a';
                }

                if (skipSet.contains(current)) {
                    continue;
                }

                count++;
            }

            result.append(current);
        }

        return result.toString();
    }
}
