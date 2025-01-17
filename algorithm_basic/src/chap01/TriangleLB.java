package chap01;

import java.util.Scanner;

public class TriangleLB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("몇 단 삼각형입니까?");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
