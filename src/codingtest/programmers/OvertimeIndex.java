package codingtest.programmers;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class OvertimeIndex {

  public static void main(String[] args) {
    System.out.println(solution(4, new int[]{4, 3, 3}));
    System.out.println(solution(1, new int[]{2, 1, 2}));
    System.out.println(solution(3, new int[]{1, 1}));
  }

  public static long solution(int n, int[] works) {
    Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

    for (int work : works) {
      queue.add(work);
    }

    while (n>0 && !queue.isEmpty()) {
      int maxWork = queue.poll();
      if (maxWork>0) {
        queue.add(maxWork-1);
        n--;
      }
    }

    long fatigue = 0;
    while (!queue.isEmpty()) {
      int work = queue.poll();
      fatigue += (long) work * work;
    }

    return fatigue;
  }
}
