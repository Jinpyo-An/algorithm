package chapter05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution3_1 {

    public static int solution(int N, int[][] board, int M, int[] moves) {
        int count = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int move : moves) {
            int col = move - 1;

            for (int i = 0; i < N; i++) {
                if (board[i][col] == 0) continue;

                int doll = board[i][col];
                board[i][col] = 0;

                if (!stack.isEmpty() && stack.peek() == doll) {
                    stack.pop();
                    count += 2;
                } else {
                    stack.push(doll);
                }
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, board, M, moves));
    }
}
