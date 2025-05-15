/*
주어진 문자열 s를 문자 배열로 만든다.
이 문자 배열의 모든 원소에 대해 순차적으로 순회한다.
다음 작업을 반복한다.
- 문자가 공백이면 건너 뛴다.
- 문자가 공백이 아니면, 거리만큼 문자를 민다.
  - 하나씩 문자를 민다.
  - 문자가 z이면 a로 변환한다.

변환된 문자 배열을 String으로 변환한 후 return한다.
 */

package programers.level01.day09;

public class Solution01 {

    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            char ch = charArr[i];

            if (ch != ' ') {
                int count = 0;

                while (count < n) {
                    if (ch == 'z') {
                        ch = 'a';
                    } else if (ch == 'Z') {
                        ch = 'A';
                    } else {
                        ch = (char) (ch + 1);
                    }
                    count++;
                }
            }

            charArr[i] = ch;
        }


        return String.valueOf(charArr);
    }
}
