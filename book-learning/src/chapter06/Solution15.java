/*
1. N명의 사람을 Deque에 저장한다. people, 초기 위치(0)을 저장한 position 변수 선언
2. people의 크기가 1보다 클 때까지 다음 작업을 반복
   2-1. 만약 위치가 맨 뒤 라면, 맨 앞의 원소를 지운다. 그리고 position을
 */

package chapter06;

import java.util.ArrayDeque;

public class Solution15 {

    public static int solution(int N, int K) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                deque.addLast(deque.pollFirst());
            }
            deque.pollFirst();
        }

        return deque.pollFirst();
    }
}
