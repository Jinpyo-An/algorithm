/**
 *
 */

package programers.basictraining.day17;

import java.util.ArrayList;

public class Solution05 {

    public String[] solution(String myString) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (ch == ' ') continue;
        }

        return answer.toArray(String[]::new);
    }
}
