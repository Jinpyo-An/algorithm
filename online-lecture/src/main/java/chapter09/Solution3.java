package chapter09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Plan implements Comparable<Plan> {

    int time;
    char event;

    public Plan(int time, char event) {
        this.time = time;
        this.event = event;
    }

    @Override
    public int compareTo(Plan o) {
        if (this.time == o.time) {
            return this.event - o.event;
        }

        return this.time - o.time;
    }
}

public class Solution3 {

    public static int solution(List<Plan> plans) {
        int maxCount = Integer.MIN_VALUE;
        int count = 0;

        Collections.sort(plans);

        for (Plan plan : plans) {
            if (plan.event == 's') count++;
            else if (plan.event == 'e') count--;

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Plan> plans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            plans.add(new Plan(start, 's'));
            plans.add(new Plan(end, 'e'));
        }

        System.out.println(solution(plans));
    }
}
