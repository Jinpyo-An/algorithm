package programers.basic_training.day06;

public class Solution02 {

    public int solution(int n, String control) {

        char[] controlArr = control.toCharArray();

        for (char c : controlArr) {
            if (c == 'w') n += 1;
            else if (c == 's') n -= 1;
            else if (c == 'd') n += 10;
            else n -= 10;
        }

        return n;
    }
}
