/**
 * 할 일이 담긴 문자열 배열 todoList / 일을 마쳤는지 나타내는 boolean 배열 finished
 * todoList에서 마치지 못한 일들을 순서대로 담은 문자열 배열 return
 *
 * 1. 마치지 못한 일들을 담을 리스트 notFinishedTodo 선언
 * 2. finished를 순회하여 false 원소에 해당하는 인덱스 todoList 문자열 추가
 * 3. String[] 배열로 반환
 */

package programers.basictraining.day14;

import java.util.ArrayList;

public class Solution03 {

    public String[] solution(String[] todoList, boolean[] finished) {
        ArrayList<String> notFinishedTodo = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                notFinishedTodo.add(todoList[i]);
            }
        }

        return notFinishedTodo.toArray(String[]::new);
    }
}
