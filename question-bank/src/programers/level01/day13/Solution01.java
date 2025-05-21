/*
입력 값
사람의 이름을 담은 문자열 배열 name
사람별 그리움 점수를 담은 배열 yearning
각 사진의 인물들의 이름을 담은 2자원 문자열 배열 photo

1. 이름이 키, 그리움 점수가 값인 Map을 만든다.
2. name과 yearning을 순회하여 이름과 점수를 쌍을 지어 Map에 넣는다.
3. photo의 각 원소를 순회하여 Map과 매핑지어 점수를 더한다.
   만약 해당 이름이 Map의 키 값에 존재하지 않다면, 0을 더한다.
4. 추억의 점수를 담은 배열을 반환한다.
 */

package programers.level01.day13;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    public int[] solution(String[] names, int[] yearnings, String[][] photos) {
        Map<String, Integer> info = new HashMap<>();
        int[] scores = new int[photos.length];

        for (int i = 0; i < names.length; i++) {
            info.put(names[i], yearnings[i]);
        }

        for (int i = 0; i < photos.length; i++) {
            for (int j = 0; j < photos[i].length; j++) {
                if (info.containsKey(photos[i][j])) {
                    scores[i] += info.get(photos[i][j]);
                }
            }
        }

        return scores;
    }
}
