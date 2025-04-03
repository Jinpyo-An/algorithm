package programers.basictraining.day18;

import java.util.ArrayList;

public class Solution05 {

    public String solution(String rnyString) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rnyString.length(); i++) {
            char ch = rnyString.charAt(i);

            if (ch == 'm') {
                answer.add("rn");
                continue;
            }

            answer.add(String.valueOf(ch));
        }

        for (String s : answer) {
            sb.append(s);
        }

        return sb.toString();
    }
}
