package codingtest.programmers;

import java.util.Arrays;

public class MaximumAndMinimum {

  public static void main(String[] args) {
    String s = "-1 -2 -3 -4";
    System.out.println(solution(s));
  }

  private static String solution(String s) {
    String[] strArr = s.split(" ");

    int[] intArr = Arrays.stream(strArr)
        .mapToInt(Integer::parseInt)
        .toArray();

    int min = Arrays.stream(intArr).min().getAsInt();
    int max = Arrays.stream(intArr).max().getAsInt();

    return min + " " + max;
  }

}
