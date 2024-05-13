package codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

public class MockTest {
  public static void main(String[] args) {
    int[] answers = {1, 3, 2, 4, 2};
    int[] result = solution(answers);
    for (int i : result) {
      System.out.println(i);
    }
  }

  public static int[] solution(int[] answers) {
    int[] math1 = {1, 2, 3, 4, 5};
    int[] math2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] math3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int result1 = 0;
    int result2 = 0;
    int result3 = 0;
    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == math1[i % answers.length]) {
        result1++;
      }
      if (answers[i] == math2[i % answers.length]) {
        result2++;
      }
      if (answers[i] == math3[i % answers.length]) {
        result3++;
      }
    }

    int max = Math.max(result1, Math.max(result2, result3));

    List<Integer> result = new ArrayList<>();
    if (result1 == max) {
      result.add(1);
    }
    if (result2 == max) {
      result.add(2);
    }
    if (result3 == max) {
      result.add(3);
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
