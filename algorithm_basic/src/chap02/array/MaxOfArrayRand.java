package chap02.array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

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
        final var rand = new Random();
        final Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수: ");
        final int num = scanner.nextInt();

        final int[] height = new int[num];

        System.out.println("킷값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);

        }

        System.out.println(maxOf(height));
    }
}
