package codingtest.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class GoodSection {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int L = sc.nextInt();
    int[] S = new int[L];
    for (int i = 0; i < L; i++) {
      S[i] = sc.nextInt();
    }
    int n = sc.nextInt();

    Arrays.sort(S);

    int left = 0;
    int right = 0;
    for (int i = 0; i < L; i++) {
      if (S[i] == n){
        break;
      } else if (S[i] < n) {
        left = S[i];
      } else if (S[i] > n) {
        right = S[i];
        break;
      }
    }

    int start = left + 1;
    int end = right - 1;
    int count = 0;

    for (int i = start; i <= n; i++) {
      for (int j = n; j <= end; j++) {
        if (i < j) {
          count++;
        }
      }
    }

    System.out.println(count);
  }
}
