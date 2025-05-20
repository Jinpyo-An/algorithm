/*
cards1과 cards2를 리스트로 만든다.
goal을 길이만큼 모든 원소를 순회한다.
goal의 원소(문자열)이 cards1과 cards2의 첫번째 원소에 있는지 확인한다.
- cards가 비어있는지 확인한다. 비어있지 않으면 첫번째 원소와 str를 비교한다.
- 없으면 No를 반환한다.

 */

package programers.level01.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> cards1List = new ArrayList<>(Arrays.asList(cards1));
        List<String> cards2List = new ArrayList<>(Arrays.asList(cards2));

        for (String str : goal) {
            if (!cards1List.isEmpty()) {
                if (str.equals(cards1List.get(0))) {
                    cards1List.remove(0);
                    continue;
                }
            }

            if (!cards2List.isEmpty()) {
                if (str.equals(cards2List.get(0))) {
                    cards2List.remove(0);
                    continue;
                }
            }

            return "No";
        }

        return "Yes";
    }
}
