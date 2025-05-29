/*

 */

package programers.level01.day15;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public int solution(int n) {
        boolean[] isComposite = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = i * 2; j <= n; j += i) {

                    isComposite[j] = true;
                }
            }
        }

        return primes.size();
    }
}
