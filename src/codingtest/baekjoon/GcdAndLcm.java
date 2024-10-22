package codingtest.baekjoon;

import java.util.Scanner;

public class GcdAndLcm {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int gcd = gcd(a, b);
    int lcm = lcm(a, b, gcd);

    System.out.println(gcd);
    System.out.println(lcm);
  }

  //최대 공약수
  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  //최소 공배수
  private static int lcm(int a, int b, int gcd) {
    return (a * b) / gcd;
  }
}
