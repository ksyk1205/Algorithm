package codingtest.baekjoon;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 운동을 하는 총 시간
        int m = scanner.nextInt();  // 초기 맥박
        int M = scanner.nextInt();  // 최대 맥박
        int T = scanner.nextInt();  // 운동으로 증가하는 맥박
        int R = scanner.nextInt();  // 휴식으로 감소하는 맥박

        int time = 0;  // 운동에 필요한 총 시간
        int currentHeartRate = m;  // 현재 맥박 초기화

        while (N > 0) {
            // 운동을 할 수 있는 경우
            if (currentHeartRate + T <= M) {
                currentHeartRate += T;  // 맥박 증가
                N--;  // 운동 시간 감소
                time++;  // 총 시간 증가
            } else {
                // 휴식으로 맥박 감소
                currentHeartRate = Math.max(currentHeartRate - R, m);
                time++;  // 총 시간 증가

                // 운동을 할 수 없는 경우
                if (currentHeartRate == m && currentHeartRate + T > M) {
                    time = -1;
                    break;
                }
            }
        }

        System.out.println(time);
    }

}
