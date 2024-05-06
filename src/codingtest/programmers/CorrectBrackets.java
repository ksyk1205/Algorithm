package codingtest.programmers;

import java.util.Stack;

public class CorrectBrackets {
  public static void main(String[] args) {
    String s = "(())()";

    System.out.println(solution(s));
  }


  static boolean solution(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        stack.pop();
      }
    }
    return stack.isEmpty();
  }
}
