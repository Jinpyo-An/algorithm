/**
 * 학생들의 선발 고사 등수를 담은 배열 rank
 * 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance
 */

package programers.basictraining.day21;

import java.util.*;

public class Solution02 {

    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> rankMap = new HashMap<>();
        List<Integer> attendStudent = new ArrayList<>();
        int a, b, c = 0;

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                rankMap.put(rank[i], i);
                attendStudent.add(rank[i]);
            }
        }

        Collections.sort(attendStudent);

        a = rankMap.get(attendStudent.get(0));
        b = rankMap.get(attendStudent.get(1));
        c = rankMap.get(attendStudent.get(2));

        return 10000 * a + 100 * b + c;
    }
}
