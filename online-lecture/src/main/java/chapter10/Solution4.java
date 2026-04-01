package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Brick implements Comparable<Brick> {

    int width;
    int height;
    int weight;

    public Brick(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.width - this.width;
    }
}

public class Solution4 {

    public static int solution(int n, Brick[] bricks) {
        Arrays.sort(bricks);

        int[] dy = new int[n];

        for (int i = 0; i < n; i++) {
            dy[i] = bricks[i].height;
            for (int j = 0; j < i; j++) {
                if (bricks[i].weight < bricks[j].weight) {
                    dy[i] = Math.max(dy[i], dy[j] + bricks[i].height);
                }
            }
        }

        Arrays.sort(dy);
        return dy[n - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Brick[] bricks = new Brick[n];
        int[] dy = new int[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            bricks[i] = new Brick(width, height, weight);
        }

        System.out.println(solution(n, bricks));
    }
}
