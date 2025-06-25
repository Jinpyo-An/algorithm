/*
1. 사라진 인형의 개수를 저장하는 count 변수 선언
2. Stack 자료구조인 바구니 변수 선언
3. moves를 원소마다 순회
   3-1. "원소 - 1"을 position 변수에 대입
   3-2. boards의 배열마다 순회(길이만큼)
        3-2-1. 배열 board[position]의 원소를 확인한다.
               만약 0이라면 다음 작업으로 넘어간다.
               0이 아니라면 원소 값을 bucket에 넣고 원소를 0으로 바꾸고 작업을 종료한다.
   3-3. 만약 bucket의 크기가 2이상이면 다음 작업을 수행
        3-3-1. top 원소와 바로 하위 원소가 같은지 검사한다.
               같으면 두 원소를 pop하고 count 2를 증사킨다.
4. count를 반환한다.

 */
package chapter05;

import java.util.Stack;

public class Solution13 {

    public int solution01(int[][] boards, int[] moves) {
        int count = 0;
        Stack<Integer> bucket = new Stack<>();

        for (int move : moves) {
            int position = move - 1;
            for (int[] board : boards) {
                if (board[position] != 0) {
                    bucket.push(board[position]);
                    board[position] = 0;
                    break;
                }
            }

            if (bucket.size() >= 2) {
                if (bucket.peek() == bucket.get(bucket.size() - 2)) {
                    bucket.pop();
                    bucket.pop();
                    count += 2;
                }
            }
        }

        return count;
    }

    public int solution02(int[][] board, int[] moves) {
        Stack<Integer>[] lanes = new Stack[board.length];
        for (int i = 0; i < lanes.length; i++) {
            lanes[i] = new Stack<>();
        }

        // 2. board를 역순으로 탐색하며, 각 열의 인형을 lanes에 추가합니다.
        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    lanes[j].push(board[i][j]);
                }
            }
        }

        Stack<Integer> bucket = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            if (!lanes[move - 1].isEmpty()) {
                int doll = lanes[move - 1].pop();

                if (!bucket.isEmpty() && bucket.peek() == doll) {
                    bucket.pop();
                    answer += 2;
                } else {
                    bucket.push(doll);
                }
            }
        }

        return answer;
    }
}
