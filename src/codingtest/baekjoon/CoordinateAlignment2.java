package codingtest.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class CoordinateAlignment2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[][] points = new int[N][2];

    for (int i = 0; i < N; i++) {
      points[i][0] = sc.nextInt();
      points[i][1] = sc.nextInt();
    }

    Arrays.sort(points, (p1, p2) -> {
      if (p1[1] == p2[1]) {
        return Integer.compare(p1[0], p2[0]);
      } else {
        return Integer.compare(p1[1], p2[1]);
      }
    });

    for (int i = 0; i < points.length; i++) {
      System.out.println(points[i][0] + " " + points[i][1]);
    }
  }

}
