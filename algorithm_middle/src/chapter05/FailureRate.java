package chapter05;

import java.util.HashMap;
import java.util.Map;

// 실패율: 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
// 전체 스테이지 수 : N   사용자가 현재 멈춰 있는 스테이지 번호가 담긴 배열 stages
public class FailureRate {

    public int[] solution(int N, int[] stages) {
        // 1. 스테이지별 도전자 수 구하기
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        // 2. 스테이지별 실패한 사용자 수 계산
        Map<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        // 3. 각 스테이지를 순회하며, 실패율 계산
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) { // 4. 도전한 사람이 없는 경우, 실패율은 0
                fails.put(i, 0.);
            } else {
                fails.put(i, challenger[i] / total); // 5. 실패율 구함
                total -= challenger[i]; // 6. 다음 스테이지 실패율을 구하기 위해 현재 스테이지의 인원을 뺌
            }

        }

        // 7. 실패율이 높은 스테이지부터 내림차순으로 정렬
        return fails.entrySet().stream()
                .sorted(((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())))
                .mapToInt(Map.Entry::getKey).toArray();
    }
}
