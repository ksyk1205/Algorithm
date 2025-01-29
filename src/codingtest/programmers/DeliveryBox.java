package codingtest.programmers;

import java.util.Stack;

public class DeliveryBox {
  public static void main(String[] args) {
    int[] order1 = {4, 3, 1, 2, 5};
    int[] order2 = {5, 4, 3, 2, 1};

    System.out.println(solution(order1)); // 결과 2
    System.out.println(solution(order2)); // 결과 5

  }

  public static int solution(int[] order) {
    Stack<Integer> stack = new Stack<>();
    int index = 0;
    int boxNum = 1;
    int n = order.length;

    while (boxNum <= n) {
      if (boxNum == order[index]) {
        boxNum++;
        index++;
      } else if (!stack.isEmpty() && stack.peek() == order[index]) {
        stack.pop();
        index++;
      } else {
        stack.push(boxNum);
        boxNum++;

      }
    }

    while (!stack.isEmpty() && stack.peek() == order[index]) {
      stack.pop();
      index++;
    }

    return index;

  }
}
