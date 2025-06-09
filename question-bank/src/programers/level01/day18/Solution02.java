/*
입력
- 전체 학생 수 n
- 도난당한 학생들의 번호가 담긴 배열 lost
- 여벌의 체육을 가져온 학생들의 번호가 담긴 배열 reserve

- lost의 원소가 reserve에 있으면 reserve의 해당 원소를 삭제
  - reserveList를 만든다.
  - lost를 길이 만큼 다음 작업을 반복한다.
    if(lost[i] == reserve.get(j)
    reserve.remove(i)

 */

package programers.level01.day18;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) {
            reserveList.add(i);
        }
        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) {
            lostList.add(i);
        }

        for (int i : lost) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (i == reserveList.get(j)) {
                    reserveList.remove(j);
                }
            }
        }

        for (Integer reserver : reserveList) {
            for (int i = 0; i < lostList.size(); i++) {
                if (lostList.get(i) == reserver - 1 || lostList.get(i) == reserver + 1) {
                    lostList.remove(i);
                    break;
                }
            }
        }

        return n - lostList.size();
    }
}
