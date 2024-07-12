package codingtest.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SortWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Set<String> wordSet = new HashSet<>();
    for (int i=0; i<n; i++) {
      wordSet.add(sc.next());
    }

    List<String> wordList = new ArrayList<>(wordSet);
    Collections.sort(wordList, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
          return o1.compareTo(o2);
        } else {
          return Integer.compare(o1.length(), o2.length());
        }
      }
    });

    for (String str: wordList) {
      System.out.println(str);
    }
  }

}
