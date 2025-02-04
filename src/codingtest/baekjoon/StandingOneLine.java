package codingtest.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandingOneLine {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] leftCounts = new int[N];

    for (int i = 0; i < N; i++) {
      leftCounts[i] = sc.nextInt();
    }

    List<Integer> result = new ArrayList<>();
    for (int i=N; i>=1; i--) {
      result.add(leftCounts[i-1], i);
    }

    for (Integer i : result) {
      System.out.println(i);
    }
  }
}
