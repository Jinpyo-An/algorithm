/**
 * 정수로 이루어진 리스트 numList
 * numList에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담는 리스트 return
 *
 * 1. numList 오름차순으로 정렬
 * 2. 앞 5개의 수를 제외한 배열 만든 후 리턴
 */

package programers.basictraining.day21;

import java.util.Arrays;

public class Solution01 {

    public int[] solution(int[] numList) {
        Arrays.sort(numList);

        return Arrays.copyOfRange(numList, 5, numList.length);
    }
}
