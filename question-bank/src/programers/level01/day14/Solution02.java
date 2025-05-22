/*
입력값: 월 a, 일 b
요일 문자열 배열 [FRI, SAT, SUN, MON, TUE, WED, THU]
각 월의 일을 저장한 배열 [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31]

a월 전까지 일수를 더한다.
더한 일수에 b를 더한다. sum
sum일 7로 나눈다.
나머지가 0이면 맨 뒷 요일을 리턴
나머지는 나머지의 -1 인데스의 요일을 리턴
 */

package programers.level01.day14;

public class Solution02 {

    public String solution(int a, int b) {
        String[] dayOfWeek = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daySum = 0;

        for (int i = 0; i < a - 1; i++) {
            daySum += day[i];
        }

        daySum += b;

        if (daySum % 7 == 0) {
            return dayOfWeek[dayOfWeek.length - 1];
        } else return dayOfWeek[daySum % 7 - 1];
    }
}
