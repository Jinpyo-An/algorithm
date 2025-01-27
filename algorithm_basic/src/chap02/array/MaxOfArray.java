package chap02.array;

import java.util.Scanner;

public class MaxOfArray {

    private static int maxOf(int[] a) {
        int max = a[0];

        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수: ");
        int num = scanner.nextInt();

        final int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("height[" + i + "]:");
            height[i] = scanner.nextInt();
        }

        System.out.println("최대값은 " + maxOf(height) + "입니다.");
    }
}
