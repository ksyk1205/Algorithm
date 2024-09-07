package codingtest.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReceivingReportResult {

  public static void main(String[] args) {
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    int k = 2;

    int[] result = solution(id_list, report, k);
    System.out.println(Arrays.toString(result));
  }

  private static int[] solution(String[] id_list, String[] report, int k) {
    Map<String, HashSet<String>> reportMap = new HashMap<>();
    Map<String, Integer> reportCnt = new HashMap<>();

    for (String id : id_list) {
      reportMap.put(id, new HashSet<>());
      reportCnt.put(id, 0);
    }

    for (String str : report) {
      String[] splitReport = str.split(" ");

      String reporter = splitReport[0];
      String reported = splitReport[1];

      if (!reportMap.get(reporter).contains(reported)) {
        reportMap.get(reporter).add(reported);

        reportCnt.put(reported, reportCnt.get(reported) + 1);
      }
    }

    int[] result = new int[id_list.length];
    for (int i=0; i< id_list.length; i++) {
      String id = id_list[i];
      for (String reportedUser : reportMap.get(id)) {
        if (reportCnt.get(reportedUser) >= k) {
          result[i]++;
        }
      }
    }

    return result;
  }

}
