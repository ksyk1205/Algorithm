package codingtest.programmers;

import java.util.Arrays;

public class FruitSeller {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println(solution(k, m, score));

    }

    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int totalProfit = 0;
        int boxCount = score.length;
        while (boxCount - m >= 0) {
            boxCount -= m;
            int maxScore = score[boxCount];
            totalProfit += maxScore * m;
        }

        return totalProfit;
    }
}
