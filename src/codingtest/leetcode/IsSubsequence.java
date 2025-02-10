package codingtest.leetcode;

/**
 * https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class IsSubsequence {
  public static void main(String[] args) {
    System.out.println(isSubsequence("abc", "ahbgdc")); //true
    System.out.println(isSubsequence("axc", "ahbgdc")); //false

  }

  public static boolean isSubsequence(String s, String t) {
    int i=0;
    int j=0;

    while (i < s.length() && j < t.length()) {
      char charS = s.charAt(i);
      char charT = t.charAt(j);
      j++;
      if (charS == charT) {
        i++;
      }

    }

    return i == s.length() ? true : false;
  }
}
