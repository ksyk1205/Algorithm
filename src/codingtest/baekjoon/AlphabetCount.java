package codingtest.baekjoon;

import java.util.Scanner;

public class AlphabetCount {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int[] alphabet = new int[26];

    for (char c : str.toCharArray()) {
      alphabet[c - 'a']++;
    }

    for (int n : alphabet) {
      System.out.print(n + " ");
    }
  }

}
