package codingtest.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SavePrimeNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();

    boolean[] isPrime = new boolean[N + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;

    for (int i = 2; i * i <= N; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= N; j += i) {
          isPrime[j] = false;
        }
      }
    }

    for (int i=M; i<=N; i++) {
      if (isPrime[i]) {
        System.out.println(i);
      }
    }
  }

}
