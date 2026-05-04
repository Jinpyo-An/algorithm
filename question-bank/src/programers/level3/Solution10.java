package programers.level3;

public class Solution10 {

    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int stationIdx = 0; // 기존 설치된 기지국 인덱스
        int position = 1;   // 현재 확인 중인 아파트 번호

        while (position <= n) {
            if (stationIdx < stations.length && position >= stations[stationIdx] - w) {
                position = stations[stationIdx] + w + 1;
                stationIdx++;
            } else {
                answer++;
                position += (w * 2) + 1;
            }
        }

        return answer;
    }
}
