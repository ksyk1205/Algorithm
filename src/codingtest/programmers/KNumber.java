package codingtest.programmers;

import java.util.Arrays;

public class KNumber {

  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    int[] answer = solution(array, commands);
    for (int a : answer) {
      System.out.println(a);
    }
  }

  public static int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    for (int a = 0; a < commands.length; a++) {
      int i = commands[a][0];
      int j = commands[a][1];
      int k = commands[a][2];

      int[] arr = Arrays.copyOfRange(array, i - 1, j);
      Arrays.sort(arr);

      answer[a] = arr[k - 1];

    }
    return answer;
  }
}
