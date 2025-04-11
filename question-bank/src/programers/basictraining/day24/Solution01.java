/**
 * 아메리카노 4500원, 카페 라테 5000원
 * - 메뉴 적은 팀원 -> 차가운 거로 통일
 * - 메뉴를 적지 않은 팀원 -> 차가운 아메리카노
 * 각 직원이 적은 메뉴 문자열 배열 order
 *
 * order의 각 원소 문자열을 비교
 * - "americano"를 포함하는지
 * - "cafelatte"를 포함하는지
 * - "anything"인지
 */

package programers.basictraining.day24;

public class Solution01 {

    public int solution(String[] order) {
        int sumPrice = 0;

        for (String menu : order) {
            if (menu.contains("cafelatte")) {
                sumPrice += 5000;
            } else {
                sumPrice += 4500;
            }
        }

        return sumPrice;
    }
}
