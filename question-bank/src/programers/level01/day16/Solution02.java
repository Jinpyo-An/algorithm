/*
1. stage 번호가 key이고 실패율이 value인 Map 자료구조 result를 선언한다.
2. 다음 작업을 N번 반복한다.
   2-1. 해당 스테이지를 도달한 플레이어 변수 total를 선언하고 0으로 초기화한다.
   2-2. 해당 스테이지를 도달했지만 클리어하지 못한 플레이어 변수 stay를 선언하고 0으로 초기화한다.
   2-3. stages의 길이만큼 다음 작업을 반복한다.
        2-3-1. 원소가 i보다 크거나 같으면 total를 1더한다.
        2-3-2. 원소가 i이면 stay를 더한다.
   2-4. result(N, stay/total)를 저장한다.
 */

package programers.level01.day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution02 {

    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> result = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int total = 0;
            int stay = 0;

            for (int stage : stages) {
                if (stage >= i) {
                    total++;
                }
                if (stage == i) {
                    stay++;
                }
            }

            double failRate = total == 0 ? 0 : (double) stay / total;

            result.put(i, failRate);
        }

        List<Integer> stageList = new ArrayList<>(result.keySet());
        stageList.sort((a, b) -> {
            double diff = result.get(b) - result.get(a);
            if (diff > 0) return 1;
            else if (diff < 0) return -1;
            else return a - b;
        });

        return stageList.stream().mapToInt(i -> i).toArray();
    }
}
