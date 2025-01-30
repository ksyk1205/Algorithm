package codingtest.programmers;

public class ExpectedMatchSheet {

  public static void main(String[] args) {
    System.out.println(solution(8, 4, 7)); // 결과 3
  }

  public static int solution(int n, int a, int b) {
    int round = 0;

    while (a != b) {
      a = (a + 1) / 2;
      b = (b + 1) / 2;
      round++;
    }

    return  round;
  }

}
