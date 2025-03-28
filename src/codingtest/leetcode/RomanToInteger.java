package codingtest.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 */
public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(romanToInt("III")); // 3
    System.out.println(romanToInt("LVIII")); // 58
    System.out.println(romanToInt("MCMXCIV")); // 1994
  }

  public static int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int sum = 0;

    for (int i = 0; i < s.length(); i++) {
      int now = map.get(s.charAt(i));

      if (i < s.length()-1 && now < map.get(s.charAt(i+1))) {
        sum -= now;
      } else {
        sum +=now;
      }

    }
    return sum;
  }

}
