package codingtest.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *  https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {

    System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
    System.out.println(lengthOfLongestSubstring("bbbbb")); // 1
    System.out.println(lengthOfLongestSubstring("pwwkew")); // 3
  }

  public static int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int left = 0, max = 0;

    for (int right = 0; right < s.length(); right++) {
      while (set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
      }
      set.add(s.charAt(right));
      max = Math.max(max, right - left + 1);
    }
    return max;
  }

}
