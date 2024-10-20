package codingtest.baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberCard2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int num = sc.nextInt();
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int M = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++) {
      int num = sc.nextInt();
      sb.append(map.getOrDefault(num, 0)).append(" ");
    }

    System.out.println(sb.toString().trim());
  }

}
