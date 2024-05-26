package codingtest.programmers;

public class TargetNumber {

  public static void main(String[] args) {
    int[] numbers = {1, 1, 1, 1, 1};
    int target = 3;

    System.out.println(solution(numbers, target));
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


}
