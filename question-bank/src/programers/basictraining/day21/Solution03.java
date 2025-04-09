package programers.basictraining.day21;

public class Solution03 {

    public int solution(double flo) {
        String floStr = String.valueOf(flo);
        final String[] split = floStr.split("\\.");
        return Integer.parseInt(split[0]);
    }
}
