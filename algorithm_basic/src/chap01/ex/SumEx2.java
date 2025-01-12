package chap01.ex;

import java.util.Scanner;

public class SumEx2 {
    public static int sumOf(int a, int b) {
        int start, end;

        if (a <= b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a의 값: ");
        int a = scanner.nextInt();
        System.out.println("b의 값: ");
        int b = scanner.nextInt();

        int sum = sumOf(a, b);

        System.out.println("sum의 값: " + sum);
    }
}
