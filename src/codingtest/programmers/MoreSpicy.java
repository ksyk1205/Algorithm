package codingtest.programmers;

import java.util.PriorityQueue;

public class MoreSpicy {

  public static void main(String[] args) {
    int[] scoville = {1, 2, 3, 9, 10, 12};
    int K = 7;

    System.out.println(solution(scoville, K));
  }

  public static int solution(int[] scoville, int K) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    for (int n : scoville) {
      queue.add(n);
    }

    int count = 0;

    while (queue.size() > 1 && queue.peek() < K) {
      int first = queue.poll();
      int second = queue.poll();

      int newScoville = first + (second * 2);
      queue.add(newScoville);

      count++;

      if (queue.peek() >= K) {
        return count;
      }
    }
    return queue.peek() >= K ? count : -1;

  }



}
