package codingtest.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Strings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] strArr = new String[n];
    for (int i=0; i<n; i++) {
      strArr[i] = sc.next();
    }

    for (String s : solution(n, strArr)) {
      System.out.println(s);
    }
  }

  private static List<String> solution(int n, String[] strArr) {
    List<String> answer = new ArrayList<>();
    for (String str : strArr){
      int firstIndex = 0;
      int lastIndex = str.length() - 1;

      answer.add("" + str.charAt(firstIndex) + str.charAt(lastIndex));
    }
    return answer;
  }
}
