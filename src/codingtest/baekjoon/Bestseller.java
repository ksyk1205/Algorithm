package codingtest.baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bestseller {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Map<String, Integer> bookMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String book = sc.next();
      bookMap.put(book, bookMap.getOrDefault(book, 0) + 1);
    }

    String bestseller = "";
    int maxCount = 0;

    for (Map.Entry<String, Integer> entry : bookMap.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        bestseller = entry.getKey();
      } else if (entry.getValue() == maxCount) {
        if (entry.getKey().compareTo(bestseller) < 0) {
          bestseller = entry.getKey();
        }
      }
    }

    System.out.print(bestseller);
  }

}
