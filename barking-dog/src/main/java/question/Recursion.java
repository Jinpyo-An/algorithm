package question;

public class Recursion {

    static void solution1(int N) {
        if (N == 0) return;

        System.out.println(N);
        solution1(N - 1);
    }

    static int solution2(int N) {
        if (N == 0) return 0;

        return N + solution2(N - 1);
    }
}
