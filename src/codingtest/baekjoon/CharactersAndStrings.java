package codingtest.baekjoon;

import java.util.Scanner;

public class CharactersAndStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();

    System.out.print(str.charAt(n-1));
  }

}
