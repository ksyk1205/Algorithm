package codingtest.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class DetailsOfSubmission {
  public static void main(String[] args) {
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;

    System.out.println(solution(priorities, location));
  }

  public static int solution(int[] priorities, int location) {
    Queue<Integer> queue = new LinkedList<>();
    for (int i=0; i<priorities.length; i++) {
      queue.offer(priorities[i]);
    }

    int answer = 0;
    while(!queue.isEmpty()) {
      int current = queue.poll();
      boolean hasHighPriority = false;
      for(int num: queue) {
        if (num > current) {
          hasHighPriority = true;
          break;
        }
      }

      if (hasHighPriority) {
        queue.offer(current);
      } else {
        answer++;
        if (location == 0) {
          break;
        }
      }
      location = (location - 1 + queue.size()) % queue.size();
    }

    return answer;
  }

}
