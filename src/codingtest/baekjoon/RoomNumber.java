package codingtest.baekjoon;

import java.util.Scanner;

public class RoomNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String roomNumber = sc.next();
    sc.close();

    int[] count = new int[10];

    for (char c : roomNumber.toCharArray()) {
      count[c - '0']++;
    }

    int sixNineCount = count[6] + count[9];
    count[6] = (sixNineCount + 1) / 2;
    count[9] = 0;

    int maxCount = 0;
    for (int i = 0; i < 10; i++) {
      if (count[i] > maxCount) {
        maxCount = count[i];
      }
    }

    System.out.println(maxCount);
  }

}
