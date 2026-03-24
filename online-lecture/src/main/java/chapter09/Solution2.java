package chapter09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Meeting implements Comparable<Meeting>{

    public int startTime;
    public int endtime;

    public Meeting(int startTime, int endtime) {
        this.startTime = startTime;
        this.endtime = endtime;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.endtime == o.endtime) {
            return this.startTime - o.startTime;
        }

        return this.endtime - o.endtime;
    }
}

public class Solution2 {

    public static int solution(List<Meeting> meetingList) {
        Collections.sort(meetingList);
        int answer = 0;
        int lastEndTime = Integer.MIN_VALUE;

        for (Meeting meeting : meetingList) {
            if (meeting.startTime >= lastEndTime) {
                answer++;
                lastEndTime = meeting.endtime;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Meeting> meetingList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());

            meetingList.add(new Meeting(startTime, endTime));
        }

        System.out.println(solution(meetingList));
    }
}
