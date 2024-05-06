package codingtest.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelopment {

  public static void main(String[] args) {
    int[] progresses = {95, 90, 99, 99, 80, 99};
    int[] speeds = {1, 1, 1, 1, 1, 1};

    int[] result = solution(progresses, speeds);

    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }

  }

  public static int[] solution(int[] progresses, int[] speeds) {
    Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < progresses.length; i++) {
      int days = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
      queue.offer(days);
    }

    List<Integer> answerList = new ArrayList<>();
    while (!queue.isEmpty()) {
      int cnt = 1;
      int first = queue.poll();

      while (!queue.isEmpty() && queue.peek() <= first) {
        queue.poll();
        cnt++;
      }

      answerList.add(cnt);
    }

    return answerList.stream().mapToInt(Integer::intValue).toArray();
  }

}
