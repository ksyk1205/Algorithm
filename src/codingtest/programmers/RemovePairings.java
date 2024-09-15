package codingtest.programmers;

import java.util.Stack;

public class RemovePairings {
  public static void main(String[] args) {
    String s = "baabaa";
    System.out.println(solution(s));
  }

  public static int solution(String s)
  {
    Stack<Character> stack = new Stack<>();

    for (int i=0; i<s.length(); i++) {
      char currentChar = s.charAt(i);

      if (!stack.isEmpty() && stack.peek() == currentChar) {
        stack.pop();
      } else {
        stack.push(currentChar);
      }
    }

    return stack.isEmpty() ? 1 : 0;
  }

}
