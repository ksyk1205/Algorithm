package codingtest.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    for (int i=0; i<n; i++) {
      String ps = sc.nextLine();
      System.out.println(isValid(ps) ? "YES" : "NO");
    }

  }

  private static boolean isValid(String ps) {
    Stack<Character> stack = new Stack<>();

    for (char c : ps.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.isEmpty()){
          return false;
        }
        stack.pop();
      }
    }

    return stack.isEmpty();
  }

}
