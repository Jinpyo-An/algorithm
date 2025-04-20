/*
- query를 순회하면서 다음 작업을 반복한다.
  - 짝수 인덱스: arr에서 query[i]번 인덱스 뒷 부분 자르기
  - 홀수 인덱스: arr에서 query[i]번 인덱스 앞 부분 자르기
- 결과 arr 배열을 return
 */

package programers.basictraining.bookmark;

class Solution05 {
    public int[] solution(int[] arr, int[] query) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                endIndex =
            } else {
                startIndex = query[i];
            }
        }
    }
}
