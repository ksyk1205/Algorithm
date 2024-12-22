package codingtest.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

  public static void main(String[] args) {
    String[] operations1 = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
    String[] operations2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

    System.out.println(Arrays.toString(solution(operations1)));
    System.out.println(Arrays.toString(solution(operations2)));
  }

  public static int[] solution(String[] operations) {
    PriorityQueue<Integer> minQueue = new PriorityQueue<>();
    PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

    for (String operation : operations) {
      String[] op = operation.split(" ");
      String command = op[0];
      int num = Integer.parseInt(op[1]);

      if (command.equals("I")) {
        minQueue.add(num);
        maxQueue.add(num);
      } else if (command.equals("D")) {
        if (num == 1) {
          if (!maxQueue.isEmpty()) {
            Integer max = maxQueue.poll();
            minQueue.remove(max);
          }
        } else if (num == -1) {
          if (!minQueue.isEmpty()) {
            Integer min = minQueue.poll();
            maxQueue.remove(min);
          }
        }
      }
    }

    if (maxQueue.isEmpty() && minQueue.isEmpty()) {
      return new int[]{0, 0};
    }

    int max = maxQueue.poll();
    int min = minQueue.poll();
    return new int[] {max, min};
  }

}
