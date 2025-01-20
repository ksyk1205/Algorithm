package codingtest.programmers;

public class JumpTeleport {

  public static void main(String[] args) {
    int N = 5;
    System.out.println(solution(N)); //2

    int N2 = 6;
    System.out.println(solution(N2)); //2

    int N3 = 5000;
    System.out.println(solution(N3)); //5동
  }

  public static int solution (int N) {
    int batteyUsage = 0;

    while (N>0) {
      if (N%2 == 0) {
        N/=2;
      }else {
        N -=1;
        batteyUsage++;
      }
    }

    return batteyUsage;
  }

}
