package codingtest.baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class ALotOfMoney2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger total = new BigInteger(sc.next());
    BigInteger num = new BigInteger(sc.next());

    System.out.println(total.divide(num));
    System.out.println(total.mod(num));
  }

}
