package codingtest.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HallOfFame {

  public static void main(String[] args) {
    int k = 3;
    int[] score = {10, 100, 20, 150, 1, 100, 200};

    int[] result = solution(k, score);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  private static int[] solution(int k, int[] score) {
    List<Integer> result = new ArrayList<>();
    PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

    for (int i = 0; i < score.length; i++) {
      if (hallOfFame.size() < k) {
        hallOfFame.add(score[i]);
      } else {
        if (score[i] > hallOfFame.peek()) {
          hallOfFame.poll();
          hallOfFame.add(score[i]);
        }
      }
      result.add(hallOfFame.peek());
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
  }

}
