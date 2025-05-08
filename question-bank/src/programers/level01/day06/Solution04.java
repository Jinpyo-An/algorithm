/*
정수 n과 m의 최대공약수와 최소공배수를 구하기
 */

package programers.level01.day06;

public class Solution04 {

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }

    public int gcd(int n, int m) {
        if (m == 0) return n;
        return gcd(m, n % m);
    }
}
