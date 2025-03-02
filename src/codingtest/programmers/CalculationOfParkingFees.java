package codingtest.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/92341
 */

public class CalculationOfParkingFees {

  public static void main(String[] args) {
    int[] fees1 = {180, 5000, 10, 600};
    String[] records1 = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

    System.out.println(Arrays.toString(solution(fees1, records1))); //14600, 34400, 5000

    int[] fees2 = {120, 0, 60, 591};
    String[] records2 = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
    System.out.println(Arrays.toString(solution(fees2, records2))); //0, 591

    int[] fees3 = {1, 461, 1, 10};
    String[] records3 = {"00:00 1234 IN"};
    System.out.println(Arrays.toString(solution(fees3, records3))); //14841

  }

  public static int[] solution(int[] fees, String[] records) {
    int baseTime = fees[0];
    int baseFee = fees[1];
    int unitTime = fees[2];
    int unitFee = fees[3];

    Map<String, Integer> inTimeMap = new HashMap<>();
    Map<String, Integer> totalMap = new TreeMap<>();

    for (String str : records) {
      String[] s = str.split(" ");
      int time = converterTime(s[0]);
      String carNumber = s[1];
      String action = s[2];

      if (action.equals("IN")) {
        inTimeMap.put(carNumber, time);
      } else {
        Integer remove = inTimeMap.remove(carNumber);
        if (remove != null) {
          totalMap.put(carNumber, totalMap.getOrDefault(carNumber, 0) + time - remove);
        }
      }
    }

    int lastTime = converterTime("23:59");
    for (String carNumber : new ArrayList<>(inTimeMap.keySet())) {
      if (inTimeMap.containsKey(carNumber)) {
        int inTime = inTimeMap.remove(carNumber);
        totalMap.put(carNumber, totalMap.getOrDefault(carNumber, 0) + lastTime - inTime);
      }
    }


    int[] result = new int[totalMap.size()];
    int index = 0;
    for (String carNumber : totalMap.keySet()) {
      Integer totalTime = totalMap.get(carNumber);

      if (baseTime > totalTime) {
        result[index] = baseFee;
      } else {
        result[index] = baseFee + (int) Math.ceil((double) (totalTime - baseTime) / unitTime) * unitFee;

      }
      index++;
    }

    return result;

  }

  private static int converterTime(String time) {
    String[] parts = time.split(":");
    return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
  }
}
