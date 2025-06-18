/*
입력값: 전체 스테이지 개수 N(최대 500), 사용자가 머물고 있는 스테이지 번호가 담긴 배열 stages(길이 20만)

실패율: 스테이지 도달했으나 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수

stages 원소 N + 1: N까지 클리어한 사용자
실패율이 같은 스테이지: 작은 번호 스테이지가 먼저 옴
스테이지에 도달한 유저가 없으면 실패율은 0

1. 실패율 저장할 배열 fails 선언(길이는 N)
2. N번 반복하여 각 스테이지의 실패율을 구한다.
   2-1.
 */

package chapter04;

import java.util.HashMap;
import java.util.Map;

public class Solution06 {

    public int[] solution(int N, int[] stages) {
        // 스테이지별 도전자 수를 구한다.
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        // 스테이지별 실패한 사용자 수 계산
        Map<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        // 각 스테이지를 순회하여, 실패율 계산
        for (int i = 1; i <= N; i++) {
            // 도전한 사람이 없는 경우, 실패율은 0
            if (challenger[i] == 0) {
                fails.put(i, 0.0);
            } else {
                // 실패율 구함
                fails.put(i, challenger[i] / total);
                // 다음 스페이지 실패율을 구하기 위해 현재 스테이지의 인원을 뺌
                total -= challenger[i];
            }
        }

        return fails.entrySet().stream()
                .sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(Map.Entry::getKey).toArray();
    }
}
