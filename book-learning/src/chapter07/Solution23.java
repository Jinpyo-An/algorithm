/*
문제 조건
- 각 유저는 한명의 유저를 신고
- 한 유저를 중복해서 신고할 수 있지만 1회로 처리
- k번 이상 신고된 유저는 정지되며, 해당 유저를 신고한 유저들에게 정지 사실 메일 발송

1. 각 유저 별로 신고 당한 횟수를 구한다.
   - 유저의 아이디가 key, 신고 당한 횟수가 k인 hashMap 선언
   - report를 하나씩 확인하여 신고횟수 구하기
2. key
 */

package chapter07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution23 {

    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportedUser = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();

        for (String r : report) {
            String[] s = r.split(" ");
            final String userId = s[0];
            final String reportedId = s[1];

            if (!reportedUser.containsKey(reportedId)) {
                reportedUser.put(reportedId, new HashSet<>());
            }

            reportedUser.get(reportedId).add(userId);
        }

        for (Map.Entry<String, HashSet<String>> entry : reportedUser.entrySet()) {
            if (entry.getValue().size() >= k) {
                for (String uid : entry.getValue()) {
                    count.put(uid, count.getOrDefault(uid, 0) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = count.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}
