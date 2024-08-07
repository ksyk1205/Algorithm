package codingtest.baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberCard {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      set.add(sc.nextInt());
    }

    StringBuilder sb = new StringBuilder();
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
      int num = sc.nextInt();
      if (set.contains(num)) {
        sb.append("1 ");
      } else {
        sb.append("0 ");
      }
    }
    System.out.print(sb.toString());
  }

}
