package programers.basic_training.day03;

public class Solution04 {

    public int solution(int a, int b) {
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        int AB = Integer.parseInt(strA + strB);
        int BA = Integer.parseInt(strB + strA);

        return Math.max(AB, BA);
    }
}
