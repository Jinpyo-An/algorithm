/*
1. 가격이 떨어지지 않는 기간을 담을 배열 result 선언
2. price의 모든 원소를 방문하여 다음 작업 반복
   2-1. 해당 원소 다음 부터 방문하여 다음 작업 반복
        2-1-1. 카운트를 센다.
        2-1-2. 원소를 비교한다.
               2-1-2-1. 본 원소가 비교 원소보다 크면 반복을 종료한다.
   2-2. 카운트를 result의 해당 인덱스에 넣는다.
 */

package chapter05;

import java.util.Stack;

public class Solution12 {

    public static int[] solution01(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static int[] solution02(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];


        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                // 3. 가격이 떨어졌으므로 이전 가격의 기간 계산
                int j = stack.pop();
                answer[j] = i - j;
            }
            stack.push(i);
        }

        // 4. 스택에 남아 있는 가격들은 가격이 떨어지지 않는 경우
        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }
        return answer;
    }
}
