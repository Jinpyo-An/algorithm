package chap01.ex;

import java.util.Scanner;

public class SumFor2Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        do {
            System.out.println("a의 값: ");
            a = scanner.nextInt();
            System.out.println("b의 값: ");
            b = scanner.nextInt();
        } while (b <= a);

        System.out.println("b - a의 값: " + (b - a));
    }
}
