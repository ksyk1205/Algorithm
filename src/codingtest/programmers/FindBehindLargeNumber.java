package codingtest.programmers;

import java.util.Stack;

public class FindBehindLargeNumber {

  public static void main(String[] args) {
    int[] numbers = {9, 1, 5, 3, 6, 2};
    int[] result = solution(numbers);

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  private static int[] solution(int[] numbers) {
    int[] answer = new int[numbers.length];
    Stack<Integer> stack = new Stack<>();

    for (int i = numbers.length - 1; i >= 0; i--) {
      while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
        stack.pop();
      }

      if (stack.isEmpty()) {
        answer[i] = -1;
      } else {
        answer[i] = stack.peek();
      }
      stack.push(numbers[i]);
    }

    return answer;
  }

}
