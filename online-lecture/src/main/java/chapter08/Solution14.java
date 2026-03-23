package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Solution14 {

    static int N, M, pizzaCount, answer = Integer.MAX_VALUE;
    static List<Point> houses, pizzas;
    static int[] pizzaPick;

    static void solution(int L, int s) {
        if (L == M) {
            int sum = 0;
            for (Point house : houses) {
                int distance = Integer.MAX_VALUE;
                for (int i : pizzaPick) {
                    distance = Math.min(
                            distance,
                            Math.abs(house.x - pizzas.get(i).x) + Math.abs(house.y - pizzas.get(i).y)
                    );
                }
                sum += distance;
            }
            answer = Math.min(answer, sum);
        }
        else {
            for (int i = s; i < pizzaCount; i++) {
                pizzaPick[L] = i;
                solution(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        houses = new ArrayList<>();
        pizzas = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int x = Integer.parseInt(st.nextToken());

                if (x == 1) {
                    houses.add(new Point(i, j));
                } else if (x == 2) {
                    pizzas.add(new Point(i, j));
                }
            }
        }
        pizzaCount = pizzas.size();
        pizzaPick = new int[M];
        solution(0, 0);
        System.out.println(answer);
    }
}
