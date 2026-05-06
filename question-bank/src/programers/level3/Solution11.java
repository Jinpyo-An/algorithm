package programers.level3;

public class Solution11 {

    public int solution(int sticker[]) {
        int n = sticker.length;

        // 예외 처리: 스티커가 1개인 경우
        if (n == 1) return sticker[0];

        // Case 1: 첫 번째 스티커를 뜯는 경우
        // 마지막 스티커(n-1)는 절대 뜯지 못하므로 고려 대상에서 제외 (n-2까지 진행)
        int[] dp1 = new int[n];
        dp1[0] = sticker[0];
        dp1[1] = sticker[0]; // 0번을 뜯었으므로 1번은 못 뜯음 (0번 값이 유지됨)
        for (int i = 2; i < n - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + sticker[i]);
        }

        // Case 2: 첫 번째 스티커를 뜯지 않는 경우
        // 첫 번째를 안 뜯었으므로 마지막 스티커(n-1)를 자유롭게 뜯을 수 있음
        int[] dp2 = new int[n];
        dp2[0] = 0; // 첫 번째는 안 뜯음
        dp2[1] = sticker[1];
        for (int i = 2; i < n; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + sticker[i]);
        }

        // 두 케이스 중 최댓값을 반환
        // dp1은 n-2 인덱스가 최종값, dp2는 n-1 인덱스가 최종값
        return Math.max(dp1[n - 2], dp2[n - 1]);
    }
}
