/*
입력: 정수 n
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수 리턴
 */

package programers.level01.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution01 {

    public long solution(long n) {
        String nToStr = String.valueOf(n);
        List<Integer> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nToStr.length(); i++) {
            answer.add(Integer.parseInt(String.valueOf(nToStr.charAt(i))));
        }

        Collections.sort(answer);
        Collections.reverse(answer);

        for (Integer i : answer) {
            sb.append(i);
        }

        return Long.parseLong(sb.toString());
    }

    public long solution02(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }

        return Long.parseLong(sb.reverse().toString());
    }
}
