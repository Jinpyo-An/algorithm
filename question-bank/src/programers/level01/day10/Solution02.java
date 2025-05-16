/*
첫번째 원소를 제외한 다른 원소의 값을 짝수로 맞춘다.
1번 인덱스부터 원소값의 반 횟수만큼 인덱스 번호에 해당하는 값을 결과 배열에 넣는다.
배열뒤에 0을 붙이고 위 결과 배열을 거꾸로 순회하여 배열에 추가한다.
해당 리스트를 배열로 변환한 후 리턴한다.
 */

package programers.level01.day10;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public String solution(int[] foods) {
        List<Integer> batch = new ArrayList<>();

        for (int i = 1; i < foods.length; i++) {
            if (foods[i] % 2 != 0) {
                foods[i] -= 1;
            }
            for (int j = 1; j <= foods[i] / 2; j++) {
                batch.add(i);
            }
        }

        int index = batch.size() - 1;
        batch.add(0);

        for (int i = index; i >= 0; i--) {
            batch.add(batch.get(i));
        }

        StringBuilder sb = new StringBuilder();

        for (Integer i : batch) {
            sb.append(i);
        }

        return sb.toString();
    }
}
