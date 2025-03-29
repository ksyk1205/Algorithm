package codingtest.leetcode;

/**
 * https://leetcode.com/problems/integer-to-roman/description/
 */
public class IntegerToRoman {

  public static void main(String[] args) {
    System.out.println(intToRoman(3749)); //MMMDCCXLIX
    System.out.println(intToRoman(58)); //LVIII

  }

  public static String intToRoman(int num) {
    int[] intArr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] valArr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < intArr.length; i++) {
      while (num >= intArr[i]) {
        num -= intArr[i];
        sb.append(valArr[i]);
      }
    }

    return sb.toString();
  }

}
