package codingtest.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RansomNote {

  public static void main(String[] args) {
    System.out.println(canConstruct("aab", "baa")); // true
    System.out.println(canConstruct("aa", "ab"));   // false
    System.out.println(canConstruct("aa", "aab"));  // true
  }

  public static boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();

    for (char c : magazine.toCharArray()) {
      map.put(c, map.getOrDefault(c,0)+1);
    }

    for (char c : ransomNote.toCharArray()) {
      if (!map.containsKey(c) || map.get(c) == 0) {
        return false;
      }
      map.put(c, map.get(c)-1);
    }
    return true;
  }

}
