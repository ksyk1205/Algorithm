package codingtest.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {
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

    int sum = 0;
    int minPrime = -1;

    for (int i = M; i <= N; i++) {
      if (isPrime[i]) {
        sum += i;
        if (minPrime == -1) {
          minPrime = i;
        }
      }
    }

    if (minPrime == -1) {
      System.out.println(-1);
    } else {
      System.out.println(sum);
      System.out.println(minPrime);
    }
  }

}
