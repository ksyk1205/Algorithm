package codingtest.programmers;

import java.util.HashMap;
import java.util.Map;

public class RoughKeyboard {

  public static void main(String[] args) {
    String[] keyMap = {"ABACD", "BCEFD"};
    String[] targets = {"ABCD", "AABB"};

    int[] result = solution(keyMap, targets);

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  private static int[] solution(String[] keymap, String[] targets) {
    Map<Character, Integer> keyPressMap = new HashMap<>();

    for (int i = 0; i < keymap.length; i++) {
      String key = keymap[i];
      for (int j = 0; j < key.length(); j++) {
        char c = key.charAt(j);
        int press = j + 1;
        if (!keyPressMap.containsKey(c) || keyPressMap.get(c) > press) {
          keyPressMap.put(c, press);
        }
      }
    }

    int[] result = new int[targets.length];
    for (int i = 0; i < targets.length; i++) {
      String s = targets[i];
      boolean canType = true;
      int totalCnt = 0;

      for (int j = 0; j < s.length(); j++) {
        if (keyPressMap.containsKey(s.charAt(j))) {
          totalCnt += keyPressMap.get(s.charAt(j));
        } else {
          canType = false;
          break;
        }
      }

      result[i] = canType ? totalCnt : -1;

    }

    return result;
  }
}
