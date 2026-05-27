package question;

public class Main23 {

    static long z(int n, long r, long c) {
        if (n == 0) return 0;

        long half = (long) Math.pow(2, n - 1);
        long offset = half * half;

        if (r < half && c < half) return z(n - 1, r, c);
        if (r < half) return offset + z(n - 1, r, c - half);
        if (c < half) return offset * 2 + z(n - 1, r - half, c);
        return offset * 3 + z(n - 1, r - half, c - half);
    }
}
