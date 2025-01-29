package codingtest.programmers;

import java.util.HashSet;
import java.util.Set;

public class NumberOfElementsSum {

  public static void main(String[] args) {
    int[] elements = {7, 9, 1, 1, 4};
    System.out.println(solution(elements)); // 결과 18

  }

  public static int solution(int[] elements) {
    int n = elements.length;
    Set<Integer> set = new HashSet<>();

    int[] sequences = new int[n * 2];
    for (int i = 0; i < n; i++) {
      sequences[i] = elements[i];
      sequences[i + n] = elements[i];
    }

    for (int length = 1; length <= n; length++) {
      for (int start = 0; start < n; start++) {
        int sum = 0;
        for (int j = 0; j < length; j++) {
          sum += sequences[start + j];
        }
        set.add(sum);
      }
    }
    return set.size();
  }
}
