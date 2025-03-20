/**
 * 문자열 my_string, 정수 배열 indices
 * my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙이기
 *
 * 지우고 이어 붙일 리스트 answer 선언
 * my_string을 char 배열로 변환
 * 원소에 해당하는 인덱스의 글자 "0"으로 치환
 * my_string의 원소가 0이 아닐 때만 answer에 대입
 * answer 문자열로 변환 후 반환
 */

package programers.basic_training.day11;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public String solution(String myString, int[] indices) {
        List<Character> answer = new ArrayList<>();
        char[] myStringToCharArr = myString.toCharArray();

        for (int index : indices) {
            myStringToCharArr[index] = '0';
        }

        for (char c : myStringToCharArr) {
            if (c != '0') {
                answer.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : answer) {
            sb.append(c);
        }

        return sb.toString();
    }
}
