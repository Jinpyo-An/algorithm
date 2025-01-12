package chap01.ex;

import java.util.Scanner;

public class SumEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n의 값: ");
        int n = scanner.nextInt();

        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);;

        System.out.println("sum의 값: " + sum);
    }
}
