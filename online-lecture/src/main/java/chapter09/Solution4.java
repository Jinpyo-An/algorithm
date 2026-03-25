package chapter09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Lecture implements Comparable<Lecture> {

    int money;
    int date;

    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date;
    }
}

public class Solution4 {

    public static int solution(int N, List<Lecture> lectures) {
        int answer = 0;
        Collections.sort(lectures);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int maxDate = lectures.getFirst().date;
        int j = 0;

        for (int i = maxDate; i >= 1; i--) {

            while (j < N && lectures.get(j).date == i) {
                queue.add(lectures.get(j).money);
                j++;
            }

            if (!queue.isEmpty()) answer += queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Lecture> lectures = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int date = Integer.parseInt(st.nextToken());
            lectures.add(new Lecture(money, date));
        }

        System.out.println(solution(N, lectures));
    }
}
