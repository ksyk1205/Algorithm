package codingtest.baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSet {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    Set<String> set = new HashSet<>();
    for (int i=0; i<n; i++) {
      set.add(sc.next());
    }

    int count = 0;
    for (int i=0; i<m; i++){
      String str = sc.next();
      if (set.contains(str)){
        count++;
      }
    }

    System.out.print(count);
  }

}
