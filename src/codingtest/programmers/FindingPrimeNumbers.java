package codingtest.programmers;

import java.util.HashSet;
import java.util.Set;

public class FindingPrimeNumbers {

  public static void main(String[] args) {
    String numbers = "011";
    System.out.println(solution(numbers));
  }

  public static int solution(String numbers) {
    Set<Integer> primeSet = new HashSet<>();
    char[] charArray = numbers.toCharArray();
    boolean[] visited = new boolean[numbers.length()];

    generateNumber(charArray, "", visited, primeSet);

    return primeSet.size();
  }

  private static void generateNumber(char[] numArr, String num, boolean[] visited,
      Set<Integer> primeSet) {
    if (!num.equals("")) {
      int n = Integer.parseInt(num);
      if (isPrime(n)) {
        primeSet.add(n);
      }
    }

    for (int i=0; i<numArr.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        generateNumber(numArr, num + numArr[i], visited, primeSet);
        visited[i]= false;
      }
    }
  }

  private static boolean isPrime(int n) {
    if (n == 0 || n == 1) {
      return false;
    }
    for (int i = 2; i * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

}
