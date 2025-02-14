package codingtest.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class ValidAnagram {

  public static void main(String[] args) {
    System.out.println(isAnagram("anagram", "nagaram")); // true
    System.out.println(isAnagram("rat", "car")); // false
  }

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    Map<Character, Integer> map = new HashMap<>();

    for(Character c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0)+1);
    }

    for(Character c : t.toCharArray()) {
      if (!map.containsKey(c) || map.get(c) == 0) {
        return false;
      }
      map.put(c, map.get(c)-1);
    }

    return true;

  }

}
