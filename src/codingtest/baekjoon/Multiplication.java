package codingtest.baekjoon;

import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    long result = 1;
    A = A % C;

    while (B > 0) {
      if (B % 2 == 1) {
        result = (result * A) % C;
      }
      A = (A * A) % C;
      B /= 2;
    }

    System.out.println(result);


  }

}
