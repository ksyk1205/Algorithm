package codingtest.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] strs1 = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strs1));

    String[] strs2 = {"dog","racecar","car"};
    System.out.println(longestCommonPrefix(strs2));
  }

  public static String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);

    String firstStr = strs[0];
    String lastStr = strs[strs.length-1];

    StringBuilder result = new StringBuilder();
    for (int i=0; i< Math.min(firstStr.length(), lastStr.length()); i++) {
      if (firstStr.charAt(i) != lastStr.charAt(i)) {
        return result.toString();
      }
      result.append(firstStr.charAt(i));
    }

    return result.toString();
  }

}
