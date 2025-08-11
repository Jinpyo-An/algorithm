/*
1. words를 하나씩 방문한다.
2. 단어에 대해 다음 조건을 검사한다.
   2-1. 앞 단어의 마지막 알파벳이랑 동일한지?
   2-2. 지금까지 나왔던 단어들 중 같은 단어가 있는지?
3. 두 조건 중 하나라도 참이면, 해당 인덱스를 저장한다.
4. 해당 인덱스에 1을 더하고, n으로 나눈다.
   나머지가 탈락한 사람의 번호이고, 몫에 1을 더한 것이 탈락한 차례이다.

 */

package chapter09;

public class Solution32 {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int index = -1;

        for (int i = 1; i < words.length; i++) {
            boolean check01 = false;
            boolean check02 = false;

            check01 = words[i - 1].substring(words[i - 1].length() - 1).equals(words[i].substring(0, 1));

            for (int j = 0; j < i; j++) {
                if (words[j].equals(words[i])) {
                    check02 = true;
                    break;
                }
            }

            if (check02 || check01) {
                index = i;
            }
        }

        if (index == -1) {
            return new int[]{0, 0};
        } else {
            index += 1;
            return new int[]{n % index, n / index + 1};
        }
    }
}
