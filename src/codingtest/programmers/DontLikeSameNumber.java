package codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

public class DontLikeSameNumber {
  public static void main(String[] args) {
    int[] arr = {1, 1, 3, 3, 0, 1, 1};
    int[] answer = solution(arr);

    for (int i = 0; i < answer.length; i++) {
      System.out.println(answer[i]);
    }
  }

  public static int[] solution(int[] arr) {
    List<Integer> numList = new ArrayList<>();
    numList.add(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1] != arr[i]) {
        numList.add(arr[i]);
      }
    }

    return numList.stream().mapToInt(Integer::intValue).toArray();
  }

}
