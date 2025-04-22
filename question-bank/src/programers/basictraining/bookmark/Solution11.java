/*

 */

package programers.basictraining.bookmark;

import java.util.ArrayList;
import java.util.List;

public class Solution11 {

    public String[] solution(String myStr) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);

            if (ch != 'a' && ch != 'b' && ch != 'c') {
                word.append(ch);
            } else {
                if (word.length() != 0) {
                    words.add(word.toString());
                }

                word.setLength(0);
            }
        }

        if (word.length() != 0) {
            words.add(word.toString());
        }

        return !words.isEmpty() ? words.toArray(new String[0]) : new String[]{"EMPTY"};
    }
}
