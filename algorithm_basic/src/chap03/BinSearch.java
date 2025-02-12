package chap03;

import java.util.Scanner;

public class BinSearch {

    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }

        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수: ");
        final int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값: ");
        final int key = scanner.nextInt();

        int indx = binSearch(x, num, key);

        if (indx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println("그 값은 x[" + indx + "]에 있습니다.");
    }
}
