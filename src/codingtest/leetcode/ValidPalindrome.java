package codingtest.leetcode;

/**
 * https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class ValidPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
    System.out.println(isPalindrome("race a car")); // false
    System.out.println(isPalindrome(" ")); // true
  }

  public static boolean isPalindrome(String s) {
    String str = formatString(s);
    String tmp = new StringBuilder(str).reverse().toString();

    if (str.equals(tmp)) {
      return true;
    } else {
      return false;
    }
  }

  private static String formatString (String s) {
    return s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
  }



}
