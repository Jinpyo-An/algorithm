package programers.level01.day02;

public class Solution05 {

    public int solution(String s) {
        if (s.startsWith("+")) {
            return Integer.parseInt(s.substring(1));
        }

        if (s.startsWith("-")) {
            return Integer.parseInt(s.substring(1)) * -1;
        }

        return Integer.parseInt(s);
    }
}
