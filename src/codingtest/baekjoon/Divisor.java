package codingtest.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Divisor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cnt = sc.nextInt();
    int[] divisors = new int[cnt];

    for (int i = 0; i < cnt; i++) {
      divisors[i] = sc.nextInt();
    }

    Arrays.sort(divisors);

    System.out.println(divisors[0] * divisors[cnt - 1]);
  }

}
