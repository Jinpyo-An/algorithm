package chap01.ex;

public class MinMax {
    public static int max4(int a, int b, int c, int d) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    public static int min3(int a, int b , int c) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static int min4(int a, int b , int c, int d) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }
}
