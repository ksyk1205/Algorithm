package codingtest.leetcode;

/**
 * https://leetcode.com/problems/palindrome-number/?envType=study-plan-v2&envId=top-interview-150
 */
public class PalindromeNumber {

  public static void main(String[] args) {
    System.out.println(isPalindrome(121)); //true
    System.out.println(isPalindrome(-121)); //false

  }

  public static boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    String reverse = new StringBuilder(str).reverse().toString();

    return str.equals(reverse);
  }

  public boolean isPalindrome2(int x) {
    String s = String.valueOf(x);
    int n = s.length();

    for (int i=0; i<n/2; i++) {
      if (s.charAt(i) != s.charAt(n-i-1)) return false;
    }
    return true;
  }

}
