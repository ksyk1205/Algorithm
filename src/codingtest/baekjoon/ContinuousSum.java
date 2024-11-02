package codingtest.baekjoon;

import java.util.Scanner;

public class ContinuousSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }

    int maxSum = arr[0];
    int currentSum = arr[0];
    for (int i=1; i<n; i++) {
      currentSum = Math.max(arr[i], arr[i] + currentSum);
      maxSum = Math.max(maxSum, currentSum);
    }

    System.out.println(maxSum);
  }

}
