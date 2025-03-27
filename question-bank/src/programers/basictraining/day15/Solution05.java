/**
 * 문자열 myString, pat
 * myString 부분 문자열 중 pat이 존재하면 1 아니면 0 리턴
 * 알파벳 대소문자 구분 x
 * <p>
 * idea: pat 문자열 길이 만큼 한칸 씩 이동하면서 문자열을 비교한다.
 * <p>
 * 1. "myString 문자열 길이 - pat 문자열 길이"만큼 순회
 * 2. pat 소문자로 만들기
 * 3. 한칸씩 이동하여 추출한 문자열을 소문자로 만들고 비교
 */

package programers.basictraining.day15;

public class Solution05 {

    public int solution(String myString, String pat) {
        String lowerPat = pat.toLowerCase();

        if (myString.length() < pat.length()) return 0;

        if (myString.length() == pat.length()) {
            if (myString.toLowerCase().equals(lowerPat)) return 1;
            return 0;
        }

        for (int i = 0; i < myString.length() - pat.length(); i++) {
            String temp = myString.substring(i, pat.length() + i).toLowerCase();
            if (temp.equals(lowerPat)) return 1;
        }

        return 0;
    }
}
