package codingtest.programmers;

public class FoodFighterContest {

  public static void main(String[] args) {
    int[] food = {1, 3, 4, 6};

    System.out.println(solution(food));
  }

  private static String solution(int[] food) {
    StringBuilder left = new StringBuilder();
    StringBuilder right = new StringBuilder();

    for (int i = 1; i < food.length; i++) {
      int count = food[i] / 2;
      for (int j = 0; j < count; j++) {
        left.append(i);
        right.insert(0, i);
      }
    }
    left.append(0);
    left.append(right);

    return left.toString();
  }
}
