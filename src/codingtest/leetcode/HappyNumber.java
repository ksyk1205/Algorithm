package codingtest.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150
 */
public class HappyNumber {

  public static void main(String[] args) {
    System.out.println(isHappy(19)); // true
    System.out.println(isHappy(2));  // false

  }

  public static boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();

    while (n != 1 && !set.contains(n)) {
      set.add(n);
      int sum = 0;
      while (n > 0) {
        int digit = n % 10;
        sum += digit * digit;
        n /= 10;
      }
      n = sum;
    }

    return n == 1;
  }

}
