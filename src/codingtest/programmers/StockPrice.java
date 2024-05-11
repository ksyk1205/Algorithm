package codingtest.programmers;

import java.util.Stack;

public class StockPrice {

  public static void main(String[] args) {
    int[] price = {1, 2, 3, 2, 3};

    int[] answer = solution(price);
    for (int a: answer){
      System.out.println(a);
    }

  }

  public static int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < prices.length; i++) {
      while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
        int idx = stack.pop();
        answer[idx] = i - idx;
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      int idx = stack.pop();
      answer[idx] = prices.length - idx - 1;
    }

    return answer;
  }


  public int[] solutionArray(int[] prices) {
    int length = prices.length;
    int[] answer = new int[length];
    int i, j;
    for (i = 0; i < length; i++) {
      for (j = i + 1; j < length; j++) {
        answer[i]++;
        if (prices[i] > prices[j])
          break;
      }
    }
    return answer;
  }

}
