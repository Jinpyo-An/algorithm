/*

babbling의 각 원소를 순회한다.
원소를 word라고 하자.
word를 각 발음 가능한 단어를 숫자로 치환한다.
연속된 숫자가 있으면 불가능하여 넘어간다.


 */
package programers.level01.day15;

public class Solution04 {

    public int solution(String[] babbling) {
        int count = 0;

        for (String word : babbling) {
            String repWord = word.replace("aya", "1")
                    .replace("ye", "2")
                    .replace("woo", "3")
                    .replace("ma", "4");

            if (repWord.contains("11") || repWord.contains("22") || repWord.contains("33") || repWord.contains("44")) continue;

            final String result = repWord.replaceAll("[1234]", "");
            if (result.isEmpty()) count++;
        }

        return count;
    }
}
