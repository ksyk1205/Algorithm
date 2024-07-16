package codingtest.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListeningAndWatch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    Set<String> set = new HashSet<>();
    List<String> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      set.add(sc.next());
    }

    for (int i=0; i<m; i++){
      String str = sc.next();
      if (set.contains(str)) {
        list.add(str);
      }
    }

    Collections.sort(list);

    System.out.println(list.size());
    for (int i=0; i<list.size(); i++) {
      System.out.println(list.get(i));
    }
  }

}
