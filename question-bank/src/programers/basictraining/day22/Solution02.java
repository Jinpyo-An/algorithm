package programers.basictraining.day22;

import java.math.BigInteger;

public class Solution02 {

    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        BigInteger sum = numA.add(numB);

        return sum.toString();
    }
}
