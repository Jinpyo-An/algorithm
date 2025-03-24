/**
 * 정수 리스트 num_list
 * <p>
 * 첫 번째로 나오는 음수의 인덱스 return, 음수가 없다면 -1 return
 */

package programers.basictraining.day12;

public class Solution02 {

    public int solution(int[] numList) {
        int answer = -1;

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] < 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
