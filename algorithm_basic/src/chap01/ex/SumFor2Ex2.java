package chap01.ex;

import java.util.Scanner;

public class SumFor2Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.println("양의 정수를 입력하세요: ");
            n = scanner.nextInt();
        } while (n <= 0);

        String strN = Integer.toString(n);

        System.out.println("그 수는 " + strN.length() + "자리입니다.");
    }
}
