/*
주사위 4개 굴렸을 때 나온 숫자에 따라 다음 점수를 얻음
- 모두 p로 같다면 -> 1111 x p점
- 3개 p, 1개 q -> (10 x p + q)^2점
- 2개 p, 2개 q -> (p + q) x |p-q|점
- 2개 p, 1개 q, 1개 r -> q x r점
- 다 다르면 -> 가장 작은 숫자만큼의 점수

a, b, c, d를 비교 한다.
모두 같으면 1111 x p를 반환한다.
3개가 같으면 (10 x p + q)^2를 반환한다.


 */

package programers.basictraining.bookmark;

import java.util.Arrays;

public class Solution02 {

    public int solution(int a, int b, int c, int d) {
        int score = 0;
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        if (dice[0] == dice[3]) {
            score = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            score = (int) Math.pow(10 * dice[1] + dice[0] + dice[3] - dice[1], 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            score = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        } else if (dice[0] == dice[1]) {
            score = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            score = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            score = dice[0] * dice[1];
        } else {
            score = dice[0];
        }

        return score;
    }
}
