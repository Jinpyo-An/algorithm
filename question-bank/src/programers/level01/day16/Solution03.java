/*
다트 게임 조건
- 3번의 기회
- 점수: 0 ~ 10
- 각 기회마다 옵션
  - 스타상("*"): 해당 점수와 바로 전 점수를 각 2배 만듬
    - 첫번째 올 경우 해당 점수만 2배
    - 다른 스타상과 중첩 가능 -> 4배
  - 아차상("#"): 해당 점수 마이너스
    - 스타상과 아차상 효과 중첩 -> -2배

1. tried를 순회하여 총 점수를 구한다.
   1-1. 만약 점수의 길이가 2이면 다음 작업을 진행한다.
        1-1-1. 점수를 저장할 변수 score, 보너스를 저장할 정수 변수 bonus를 선언한다.
        1-1-2. 첫 문자를 정수로 바꿔 score에 저장, 2번째 문자를 판별하여 bonus에 대입하여 제곱한다.
        1-1-3. 점수 결과를 result 배열에 넣는다.
   1-2. 만약 점수의 길이가 3이면 다음 작업을 잔행한다.(옵션있을 경우)
        1-2-1. 점수를 저장할 변수 score, 보너스를 저장할 정수 변수 bonus를 선언한다.
        1-2-2. 첫 문자를 정수로 바꿔 score에 저장, 2번째 문자를 판별하여 bonus에 대입하여 제곱한다.
        1-2-3. 옵션이 *이면 해당 점수를 2배로 만들고 바로 전에 얻은 점수도 2배로 만든다.
               옵션이 #이면 해당 점수를 마이너스한다.


 */

package programers.level01.day16;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public int solution(String dartResult) {
        List<String> tried = new ArrayList<>();
        StringBuilder round = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            round.append(c);

            if (c == 'S' || c == 'D' || c == 'T') {
                if (i + 1 < dartResult.length() && (dartResult.charAt(i + 1) == '*') || dartResult.charAt(i + 1) == '#') {
                    round.append(dartResult.charAt(i + 1));
                    i++;
                }
                tried.add(round.toString());
                round.setLength(0);
            }
        }

        for (int i = 0; i < tried.size(); i++) {
            String temp = tried.get(i);

            int score = temp.charAt(0) - '0';
            char bonus = temp.charAt(1);


            if (temp.length() == 2) {

            } else {

            }
        }

        return 0;
    }
}
/*
1. tried를 순회하여 총 점수를 구한다.
   1-1. 만약 점수의 길이가 2이면 다음 작업을 진행한다.
        1-1-1. 점수를 저장할 변수 score, 보너스를 저장할 정수 변수 bonus를 선언한다.
        1-1-2. 첫 문자를 정수로 바꿔 score에 저장, 2번째 문자를 판별하여 bonus에 대입하여 제곱한다.
        1-1-3. 점수 결과를 result 배열에 넣는다.
   1-2. 만약 점수의 길이가 3이면 다음 작업을 잔행한다.(옵션있을 경우)
        1-2-1. 점수를 저장할 변수 score, 보너스를 저장할 정수 변수 bonus를 선언한다.
        1-2-2. 첫 문자를 정수로 바꿔 score에 저장, 2번째 문자를 판별하여 bonus에 대입하여 제곱한다.
        1-2-3. 옵션이 *이면 해당 점수를 2배로 만들고 바로 전에 얻은 점수도 2배로 만든다.
               옵션이 #이면 해당 점수를 마이너스한다.
 */