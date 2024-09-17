package codingtest.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GettingRanked {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int newScore = sc.nextInt();
    int P = sc.nextInt();

    List<Integer> ranking = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      ranking.add(sc.nextInt());
    }

    if (N == 0) {
      System.out.println(1);
      return;
    }

    int rank = 1;
    for (int i = 0; i < N; i++) {
      if (newScore < ranking.get(i)) {
        rank++;
      } else if (newScore == ranking.get(i)) {
        break;
      } else {
        break;
      }
    }

    if (N == P && newScore <= ranking.get(N - 1)) {
      System.out.println(-1);
    } else {
      System.out.println(rank);
    }
  }
}
