package codingtest.programmers;

import java.util.HashSet;
import java.util.Set;

public class CuttingRollCake {

  public static void main(String[] args) {

    int[] topping1 = {1, 2, 1, 3, 1, 4, 1, 2};
    int[] topping2 = {1, 2, 3, 1, 4};

    System.out.println(solution(topping1)); // 출력: 2
    System.out.println(solution(topping2)); // 출력: 0
  }

  public static int solution(int[] topping) {
    int n = topping.length;
    int[] left = new int[n];
    int[] right = new int[n];

    Set<Integer> leftSet = new HashSet<>();
    Set<Integer> rightSet = new HashSet<>();

    for (int i = 0; i < n; i++) {
      leftSet.add(topping[i]);
      left[i] = leftSet.size();
    }

    for (int i = n- 1; i >= 0; i--) {
      rightSet.add(topping[i]);
      right[i] = rightSet.size();
    }
    int count = 0;
    for (int i = 0; i < n - 1; i++) {
      if (left[i] == right[i + 1]) {
        count++;
      }
    }

    return count;
  }
}
