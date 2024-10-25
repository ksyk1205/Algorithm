package codingtest.programmers;

public class MinimumCommonMultiple {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{2, 6, 8, 14}));
  }

  public static int solution(int[] arr) {
    int lcm = arr[0];
    for (int i = 1; i < arr.length; i++) {
      lcm = lcm(lcm, arr[i]);
    }
    return lcm;
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }

  private static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

}
