package codingtest.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class TargetNumber {

  public static void main(String[] args) {
    int[] numbers = {1, 1, 1, 1, 1};
    int target = 3;

//    System.out.println(solution(numbers, target)); //5
    System.out.println(bfs(numbers, target)); //5

    int[] numbers2 = {4, 1, 2, 1};
    int target2 = 4;

//    System.out.println(solution(numbers2, target2)); // 2
    System.out.println(bfs(numbers2, target2)); // 2
  }

  private static int solution(int[] numbers, int target) {
    return dfs(numbers, target, 0, 0);
  }

  private static int dfs(int[] numbers, int target, int index, int sum) {
    if (index == numbers.length) {
      return sum == target ? 1 : 0;
    }

    int plus = dfs(numbers, target, index + 1, sum + numbers[index]);
    int minus = dfs(numbers, target, index + 1, sum - numbers[index]);

    return plus + minus;
  }


  private static int bfs(int[] numbers, int target) {
    int n = numbers.length;

    Queue<Integer> sumQueue = new LinkedList<>();
    Queue<Integer> indexQueue = new LinkedList<>();

    sumQueue.add(numbers[0]);
    sumQueue.add(-1 * numbers[0]);
    indexQueue.add(0);
    indexQueue.add(0);

    int count = 0;

    while (!sumQueue.isEmpty()) {
      Integer sum = sumQueue.poll();
      Integer index = indexQueue.poll();

      if (index == n-1) {
        if (sum == target) {
          count++;
        }
      } else {
        sumQueue.add(sum + numbers[index+1]);
        indexQueue.add(index+1);

        sumQueue.add(sum + (-1 * numbers[index+1]));
        indexQueue.add(index+1);
      }
    }

    return count;
  }

}
