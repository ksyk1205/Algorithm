package codingtest.programmers;

import java.util.Stack;

public class RotateParentheses {
  public static void main(String[] args) {
    System.out.println(solution("[](){}"));
    System.out.println(solution("}]()[{"));
    System.out.println(solution("[)(]"));
    System.out.println(solution("}}}"));
  }

  private static int solution(String s) {
    int n = s.length();
    int count = 0;

    for (int i = 0; i < n; i++) {
      String rotated = s.substring(i) + s.substring(0, i);
      if (isValidParentheses(rotated)) {
        count++;
      }
    }

    return count;
  }

  private static boolean isValidParentheses(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '[' || ch == '{') {
        stack.push(ch);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        if (!isMatchingPair(top, ch)) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  private static boolean isMatchingPair(char open, char close) {
    return (open == '(' && close == ')') ||
        (open == '[' && close == ']') ||
        (open == '{' && close == '}');
  }
}
