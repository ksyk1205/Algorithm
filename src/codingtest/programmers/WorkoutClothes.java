package codingtest.programmers;

import java.util.Arrays;

public class WorkoutClothes {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(n, lost, reserve));

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int result = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = reserve[i] = -1;
                    result++;
                    break;
                }
            }
        }

        for (int lostP : lost) {
            for (int i = 0; i < reserve.length; i++) {
                if (reserve[i] == lostP - 1 || reserve[i] == lostP + 1) {
                    result++;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        return result;
    }
}
