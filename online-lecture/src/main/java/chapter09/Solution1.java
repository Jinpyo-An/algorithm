package chapter09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Player implements Comparable<Player> {

    public int height;
    public int weight;

    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }


    @Override
    public int compareTo(Player o) {

        if (this.height == o.height) {
            return o.weight - this.weight;
        }

        return o.height - this.height;
    }
}

public class Solution1 {

    public static int solution(List<Player> players) {
        int answer = 0;
        int maxWeight = Integer.MIN_VALUE;

        for (Player player : players) {
            if (player.weight > maxWeight) {
                maxWeight = player.weight;
                answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Player> players = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            players.add(new Player(height, weight));
        }
        Collections.sort(players);

        System.out.println(solution(players));
    }
}
