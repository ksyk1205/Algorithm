package codingtest.baekjoon;

import java.util.Scanner;

public class CutOutputTenPieces {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    for (int i=0; i<str.length(); i+=10) {
      if (i+10<str.length()) {
        System.out.println(str.substring(i, i+10));
      }else {
        System.out.println(str.substring(i));
      }
    }
  }

}
