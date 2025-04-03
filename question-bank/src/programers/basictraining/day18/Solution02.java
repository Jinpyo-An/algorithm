package programers.basictraining.day18;

import java.util.ArrayList;
import java.util.Collections;

public class Solution02 {

    public String[] solution(String myString) {
        String[] str = myString.split("x");
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            if (!s.isEmpty()) {
                answer.add(s);
            }
        }

        Collections.sort(answer);

        return answer.toArray(String[]::new);
    }
}
