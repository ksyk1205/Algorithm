package codingtest.baekjoon;

import java.util.Scanner;

public class Tournament {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int jimin = sc.nextInt();
    int hansu = sc.nextInt();

    int round = 0;
    while (jimin != hansu) {
      round++;

      jimin = (jimin + 1) / 2;
      hansu = (hansu + 1) / 2;
    }

    System.out.println(round);
  }

}
