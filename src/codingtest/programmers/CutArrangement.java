package codingtest.programmers;

import java.util.Arrays;

public class CutArrangement {

  public static void main(String[] args) {
    int n1 = 3;
    long left1 = 2, right1 = 5;
    System.out.println(Arrays.toString(solution(n1, left1, right1)));

    int n2 = 4;
    long left2 = 7, right2 = 14;
    System.out.println(Arrays.toString(solution(n2, left2, right2)));
  }

  public static int[] solution(int n, long left, long right) {
    int[] result = new int[(int) (right - left + 1)];

    for (long i = left; i <= right; i++) {
      int row = (int) (i / n);
      int col = (int) (i % n);
      result[(int) (i - left)] = Math.max(row, col) + 1;
    }

    return result;
  }

}
