/*
단어가 공백 한 개 이상으로 구분되어 있는 문자열 myString
단어를 순서대로 담은 문자열 배열 return

myString을 문자마다 순회한다.
문자를 하나씩 순서대로 문자열 배열에 담는다.
- 문자를 만나면 변수에 담는다.
- 공백 문자를 만나면 지금까지 담은 문자를 배열에 담는다.
해당 배열을 반환한다.
 */
package programers.basictraining.bookmark;

import java.util.ArrayList;
import java.util.List;

public class Solution09 {

    public String[] solution(String myString) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (ch != ' ') {
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

        return words.toArray(new String[0]);
    }
}
