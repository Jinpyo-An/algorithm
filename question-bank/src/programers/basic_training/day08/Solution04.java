package programers.basic_training.day08;

import java.math.BigInteger;

public class Solution04 {

    public BigInteger solution(String number) {
        BigInteger bigInteger = new BigInteger(number);

        return bigInteger.remainder(BigInteger.valueOf(9));
    }
}
