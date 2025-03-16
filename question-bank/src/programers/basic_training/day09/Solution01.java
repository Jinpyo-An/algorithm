/**
 * 입력값: 문자열 배열 intStrs, 정수 k, s, l
 * - intStrs 각 원소는 숫자로 이루어줘 있음
 * - instStrs 각 원소마다 s번 인덱스부터 길이 l까지 부분 문자열을 잘라내어 정수로 반환
 * - 이 정수 값이 k보다 크면 정답 배열에 담기
 * <p>
 * 1. intStrs 길이만큼 반복
 * 2. 문자열을 잘라내어 정수로 변환 후 k보다 크면 배열에 담기
 */

package programers.basic_training.day09;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));

            if (num > k) answer.add(num);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
