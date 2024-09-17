package codingtest.baekjoon;

import java.util.Scanner;

public class ChoosingTemporaryClassPresident {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] classes = new int[n][5];

    for (int i=0; i<n; i++) {
      for (int j=0; j<5; j++) {
        classes[i][j] = sc.nextInt();
      }
    }

    int[] cnt = new int[n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j) {
          for (int k = 0; k < 5; k++) {
            if (classes[i][k] == classes[j][k]) {
              cnt[i]++;
              break;
            }
          }
        }
      }
    }

    int maxStudent = 0;
    int maxCnt = cnt[0];
    for (int i=1; i<n; i++) {
      if (cnt[i] > maxCnt) {
        maxCnt = cnt[i];
        maxStudent = i;
      }
    }

    System.out.println(maxStudent+1);
  }

}
