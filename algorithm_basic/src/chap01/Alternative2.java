package chap01;

import java.util.Scanner;

public class Alternative2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.println("n의 값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n / 2; i++) {
            System.out.println("+-");
        }

        if (n % 2 != 0) System.out.println("+");
    }
}
