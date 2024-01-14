package codingtest.baekjoon;

import java.util.Scanner;

public class Stick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int[] sticks = {64, 32, 16, 8, 4, 2, 1};

        int count = 0;

        for (int i = 0; i < sticks.length; i++) {
            if (x >= sticks[i]) {
                count++;
                x -= sticks[i];
            }

            if (x == 0) {
                break;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}