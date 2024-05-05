package codingtest.programmers;

import java.util.HashMap;
import java.util.Map;

public class UnsuccessfulRunner {

  public static void main(String[] args) {
    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};

    String result = solution(participant, completion);
    System.out.println(result);
  }

  public static String solution(String[] participant, String[] completion) {
    String answer = "";
    Map<String, Integer> map = new HashMap<>(participant.length);

    for (int i = 0; i < participant.length; i++) {
      map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
    }

    for (int j = 0; j < completion.length; j++) {
      Integer count = map.get(completion[j]);
      if (count != null) {
        map.put(completion[j], count - 1);
      }
    }

    for (String str : map.keySet()) {
      if (map.get(str) != 0) {
        answer = str;
        break;
      }
    }
    return answer;
  }

}
