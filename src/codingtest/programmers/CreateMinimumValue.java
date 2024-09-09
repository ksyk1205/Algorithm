package codingtest.programmers;

import java.util.Arrays;

public class CreateMinimumValue {

  public static void main(String[] args) {
    int[] A = {1, 4, 2};
    int[] B = {5, 4, 4};
    System.out.println(solution(A, B));
  }

  private static int solution(int[] A, int[] B) {
    Arrays.sort(A);
    Arrays.sort(B);

    int result = 0;
    for (int i = 0; i < A.length; i++) {
      result += A[i] * B[A.length - 1 - i];
    }
    return result;
  }
}
