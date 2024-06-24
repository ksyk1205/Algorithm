package codingtest.programmers;

public class KnightsWeapon {

  public static void main(String[] args) {
    System.out.println(solution(15, 3, 2));
  }

  public static int solution(int number, int limit, int power) {
    int totalIronWeight = 0;

    for (int i = 1; i <= number; i++) {
      int divisorCount = getDivisorCount(i);
      if (divisorCount > limit) {
        totalIronWeight += power;
      } else {
        totalIronWeight += divisorCount;
      }
    }
    return totalIronWeight;
  }

  private static int getDivisorCount(int n) {
    int count = 0;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        count++;
        if (i != n / i) {
          count++;
        }
      }
    }
    return count;
  }

}
