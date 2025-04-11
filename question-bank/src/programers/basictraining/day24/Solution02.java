/*

 */

package programers.basictraining.day24;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public String[] solution(String[] picture, int k) {
        List<String> sizeUpPicture = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String file : picture) {
            sb.setLength(0);
            char[] fileToChArr = file.toCharArray();
            for (char c : fileToChArr) {
                sb.append(String.valueOf(c).repeat(k));
            }
            for (int i = 0; i < k; i++) {
                sizeUpPicture.add(sb.toString());
            }
        }

        return sizeUpPicture.toArray(String[]::new);
    }
}
