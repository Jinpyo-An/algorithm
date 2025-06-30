/*
- 카드 뭉치에서 카드를 순서대로 한 장씩 사용
- 한번 사용한 카드는 버림
- 뽑은 카드는 사용해야함

- 입력값
  - 카드 뭉치 문자열 배열 cards1, cards2
  - 원하는 문자열 배열 goal
- 반환값: Yes or No 문자열

1. cards1, cards2, goal을 큐로 바꾼다. c1, c2, go
2. go가 빌때까지 다음 작업을 반복한다.
   2-1. go에서 pollFirst하여 맨 앞 원소를 꺼낸다. str
   2-2. c1또는 c2가 비어있지 않고 원소가 str가 일치하면 해당 원소와 str를 지운다.
        일치하지 않으면 작업을 중단한다.
3. go가 비어있으면 Yes, 그렇지 않으면 No를 반환한다.
 */

package chapter06;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Solution17 {

    public String solution01(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> c1 = new ArrayDeque<>(List.of(cards1));
        ArrayDeque<String> c2 = new ArrayDeque<>(List.of(cards2));
        ArrayDeque<String> go = new ArrayDeque<>(List.of(goal));

        while (!go.isEmpty()) {
            String str = go.pollFirst();

            if (!c1.isEmpty() && c1.peekFirst().equals(str)) {
                c1.pollFirst();
                continue;
            }

            if (!c2.isEmpty() && c2.peekFirst().equals(str)) {
                c2.pollFirst();
                continue;
            }

            return "No";
        }

        return "Yes";
    }

    public String solution02(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));

        while (!goalDeque.isEmpty()) {
            if (!cardsDeque1.isEmpty() && cardsDeque1.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            } else if (!cardsDeque2.isEmpty() && cardsDeque2.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            } else {
                break;
            }
        }

        return goalDeque.isEmpty() ? "Yes" : "No";
    }
}
