package codingtest.leetcode;

import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(isValid("()")); // true
    System.out.println(isValid("()[]{}")); // false
    System.out.println(isValid("(]")); // false
    System.out.println(isValid("([])")); // true
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    char[] chars = s.toCharArray();
    for (char c : chars) {
      if (c == '{' || c == '[' || c == '(') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        Character ch = stack.pop();
        if (!isMatchPair(ch, c)) {
          return  false;
        }
      }
    }

    return stack.isEmpty();
  }

  private static boolean isMatchPair(Character start, Character end) {
    return (start == '(' && end == ')')
        || (start == '{' && end == '}')
        || (start == '[' && end == ']');
  }

}
