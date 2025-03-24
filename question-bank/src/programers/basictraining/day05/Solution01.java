package programers.basictraining.day05;

public class Solution01 {

    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;


        for (int i = 0; i < code.length() ; i++) {
            char current = code.charAt(i);

            if (current == '1') {
                mode = (mode == 0) ? 1:0;
                continue;
            }

            if (i % 2 == mode) {
                ret.append(current);
            }
        }

        return ret.length() == 0 ? "EMPTY": ret.toString();
    }
}
