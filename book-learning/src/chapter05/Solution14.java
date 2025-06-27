/*
"U X": 현재 선택한 행에서 X칸 위에 있는 행을 선택
"D X": 현재 선택한 행에서 X칸 아래에 있는 행을 선택
"C": 현재 선택한 행을 삭제한 후, 바로 아래 행 선택한다. 단, 삭제된 행이 가장 마지막 행인 경우 바로 윗 행을 선택
"Z": 가장 최근에 삭제한 행을 원래대로 복구. 단, 현재 선택한 행은 바뀌지 않

입력값: 행의 개수 n(1,000,000), 처음 선택한 행의 위치 k(<=n), 수행한 명령어들이 담긴 문자열 cmd(200,000)

1. cmd의 각 원소(명령어)를 확인하여 다음 작업을 수행한다.
   1-1. cmd가 U일 때
   1-2. cmd가 D일 때
   1-3. cmd가 C일 때
   1-4. cmd가 Z일 때
 */


package chapter05;

public class Solution14 {

    public String solution(int rowNum, int position, String[] cmd) {

    }
}
