/*
- 다음 작업을 반복한다.
  - 첫 글자, 다른 글자의 등장 횟수를 저장할 변수 firstCount, otherCount 변수 선언
  - 문자열 s를 인덱스 1부터 반복한다.
    - 해당 문자가 firstCount
 */
package programers.level01.day17;

public class Solution02 {

    public int solution(String s) {
        int answer = 0;
        int xCount = 0;
        int otherCount = 0;
        char x = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (xCount == 0) {
                x = s.charAt(i);
                xCount = 1;
                otherCount = 0;
                continue;
            }

            if (s.charAt(i) == x) {
                xCount++;
            } else {
                otherCount++;
            }

            if (xCount == otherCount) {
                answer++;
                xCount = 0;
                otherCount = 0;
            }
        }

        if (xCount != 0) {
            answer++;
        }

        return answer;
    }
}
