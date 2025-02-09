package codingtest.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150
 */

public class IsomorphicStrings {

  public static void main(String[] args) {
    System.out.println(isIsomorphic("egg", "add")); // true
    System.out.println(isIsomorphic("foo", "bar")); // false
    System.out.println(isIsomorphic("paper", "title")); // true

  }

  public static boolean isIsomorphic(String s, String t) {
    Map<Character, Character> startMap = new HashMap<>();
    Map<Character, Character> endMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c1 = s.charAt(i);
      char c2 = t.charAt(i);

      if (startMap.containsKey(c1) && startMap.get(c1) != c2) {
        return false;
      }
      if (endMap.containsKey(c2) && endMap.get(c2) != c1) {
        return false;
      }

      startMap.put(c1, c2);
      endMap.put(c2, c1);
    }

    return true;
  }

}
