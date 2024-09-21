package codingtest.programmers;

import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {

  public static void main(String[] args) {
    String[] want = {"banana", "apple", "rice", "pork", "pot"};
    int[] number = {3, 2, 2, 2, 1};
    String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

    System.out.println(solution(want, number, discount));
  }

  private static int solution(String[] want, int[] number, String[] discount) {
    int result = 0;

    Map<String, Integer> wantMap = new HashMap<>();
    for (int i = 0; i < want.length; i++) {
      wantMap.put(want[i], number[i]);
    }

    for (int i = 0; i <= discount.length - 10; i++) {
      Map<String, Integer> discountMap = new HashMap<>();
      for (int j = i; j < i + 10; j++) {
        discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
      }

      boolean isSafe = true;
      for (String key : wantMap.keySet()) {
        if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
          isSafe = false;
          break;
        }
      }
      if (isSafe) {
        result++;
      }
    }

    return result;
  }

}
