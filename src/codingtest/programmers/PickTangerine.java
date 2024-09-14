package codingtest.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickTangerine {
  public static void main(String[] args) {
    int k = 6;
    int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

    System.out.println(solution(k, tangerine));
  }

  private static int solution(int k, int[] tangerine) {
    Map<Integer, Integer> countMap = new HashMap<>();
    for (int i : tangerine) {
      countMap.put(i, countMap.getOrDefault(i, 0)+1);
    }

    List<Integer> countList = new ArrayList<>(countMap.values());
    countList.sort(Collections.reverseOrder());

    int total = 0;
    int kind = 0;
    for (int count: countList) {
      total += count;
      kind++;
      if (total >= k) {
        break;
      }
    }

    return  kind;
  }


}
