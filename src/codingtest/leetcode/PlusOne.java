package codingtest.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/plus-one/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class PlusOne {

  public static void main(String[] args) {
    int[][] testCases = {
        {1, 2, 3},
        {4, 3, 2, 1},
        {9},
        {9, 9, 9}
    };

    for (int[] testCase : testCases) {
      int[] result = plusOne(testCase);
      System.out.println(Arrays.toString(result));
      System.out.println("------------");
    }
  }

  public static int[] plusOne(int[] digits) {
    int n = digits.length;

    for (int i=n-1; i>=0; i--) {
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }

    int[] result = new int[n+1];
    result[0] = 1;
    return result;
  }

}
