/*
입력: 참가 선수 이름이 담긴 배열 participant, 완주한 선수 이름이 담긴 배열 completion

- participant 배열과 completion 배열을 정렬한다.
- completion 길이 만큼 반복한다.
  for(i = 0; completion.length; i++)
  - 각 작업에서 같은 인덱스의 참가 선수를 뽑아내 비교한다.
    participant[i].equals(completion[i])
  - 만약 다르다면 해당 인덱스의 participant 원소를 리턴한다.
    return participant[i]
  -
 */

package programers.level01.day18;

import java.util.Arrays;

public class Solution01 {

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }
}
