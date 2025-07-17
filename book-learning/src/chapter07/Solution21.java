/*
1. key가 아이디 value가 닉네임인 hashMap을 선언한다.
2. record를 순회하며 다음 작업을 한다.
   2-1. record[i]를 빈칸을 구분자로 하여 쪼갠다.
   2-2. 첫번째 원소가 Enter나 Change면 hashMap에 key로 두번째원소(아이디), value로  세번재 원소(닉네임)을 넣는다.
3. record를 순회하여 다음 작업을 한다.
   3-1. Enter일 때, 닉네임 + "님이 들ㅇ
 */

package chapter07;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution21 {

    public String[] solution01(String[] record) {
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<String> resultArr = new ArrayList<>();

        for (String str : record) {
            String[] s = str.split(" ");

            if (s[0].equals("Enter") || s[0].equals("Change")) {
                hashMap.put(s[1], s[2]);
            }
        }

        for (String str : record) {
            String[] s = str.split(" ");

            if (s[0].equals("Enter")) {
                resultArr.add(hashMap.get(s[1]) + "님이 들어왔습니다.");
            } else if (s[0].equals("Leave")) {
                resultArr.add(hashMap.get(s[1]) + "님이 나갔습니다.");
            }
        }

        String[] result = new String[resultArr.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = resultArr.get(i);
        }

        return result;
    }

    public String[] solution02(String[] record) {
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter", "님이 들어왔습니다.");
        msg.put("Leave", "님이 나갔습니다.");

        HashMap<String, String> uid = new HashMap<>();

        for (String s : record) {
            String[] cmd = s.split(" ");
            if (cmd.length == 3) {
                uid.put(cmd[1], cmd[2]);
            }
        }

        ArrayList<String> answer = new ArrayList<>();

        for (String s : record) {
            String[] cmd = s.split(" ");

            if (msg.containsKey(cmd[0])) {
                answer.add(uid.get(cmd[1]) + msg.get(cmd[0]));
            }
        }

        return answer.toArray(new String[0]);
    }
}
