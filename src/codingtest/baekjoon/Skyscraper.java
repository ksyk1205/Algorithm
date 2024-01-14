package codingtest.baekjoon;

import java.util.Scanner;

public class Skyscraper {
        static int[] map;
        static int N;

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            N = scanner.nextInt();
            map = new int[N];

            for (int i = 0; i < N; i++) {
                map[i] = scanner.nextInt();
            }

            int ans = 0;
            for (int i = 0; i < N; i++) {
                ans = Math.max(ans, count(i));
            }

            System.out.println(ans);

            scanner.close();
        }

        public static int count ( int idx){
            int cnt = 0;

            cnt += countDirection(idx, -1); // 왼쪽
            cnt += countDirection(idx, 1);  // 오른쪽

            return cnt;
        }

        private static int countDirection ( int idx, int direction){
            int cnt = 0;
            double tmp = 0;

            for (int i = idx + direction; i >= 0 && i < N; i += direction) {
                double slope = (double) (map[idx] - map[i]) / (idx - i);

                if ((direction == -1 && i == idx - 1) || (direction == 1 && i == idx + 1) || (tmp > slope && direction == -1) || (tmp < slope && direction == 1)) {
                    cnt++;
                    tmp = slope;
                }
            }

            return cnt;
        }

}
