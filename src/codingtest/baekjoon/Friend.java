package codingtest.baekjoon;

import java.util.Scanner;

public class Friend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사람의 수 N 입력
        int N = scanner.nextInt();

        // 친구 관계 입력
        char[][] friends = new char[N][N];
        for (int i = 0; i < N; i++) {
            friends[i] = scanner.next().toCharArray();
        }

        // 2-친구 여부를 저장하는 2D 배열 생성
        int[][] connected = new int[N][N];

        // Floyd-Warshall 알고리즘으로 모든 쌍의 연결 여부 계산
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (friends[i][j] == 'Y' || (friends[i][k] == 'Y' && friends[k][j] == 'Y')) {
                        connected[i][j] = 1;
                    }
                }
            }
        }

        // 각 사람의 2-친구 수 계산
        int maxTwoFriends = 0;
        for (int i = 0; i < N; i++) {
            int twoFriends = 0;
            for (int j = 0; j < N; j++) {
                twoFriends += connected[i][j];
            }
            maxTwoFriends = Math.max(maxTwoFriends, twoFriends);
        }

        System.out.println(maxTwoFriends);

        scanner.close();
    }
}
