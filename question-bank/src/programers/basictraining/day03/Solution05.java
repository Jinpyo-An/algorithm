package programers.basictraining.day03;

public class Solution05 {

    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int AB = Integer.parseInt(strA + strB);

        return Math.max(AB, (2 * a * b));
    }
}
