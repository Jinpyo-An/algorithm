package chap02.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    private static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수: ");
        final int num = scanner.nextInt();
        final int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬");
        System.out.println("x = " + Arrays.toString(x));

    }
}
