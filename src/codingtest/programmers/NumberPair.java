package codingtest.programmers;

public class NumberPair {

  public static void main(String[] args) {
    String X = "100";
    String Y = "203045";

    System.out.println(solution(X, Y));
  }

  private static String solution(String X, String Y) {
    int[] xCnt = new int[10];
    int[] yCnt = new int[10];

    for (Character c : X.toCharArray()) {
      xCnt[c - '0']++;
    }

    for (Character c : Y.toCharArray()) {
      yCnt[c - '0']++;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 9; i >= 0; i--) {
      int minCnt = Math.min(xCnt[i], yCnt[i]);
      for (int j = 0; j < minCnt; j++) {
        sb.append(i);
      }
    }

    if (sb.length() == 0) {
      return "-1";
    }

    if (sb.charAt(0) == '0') {
      return "0";
    }

    return sb.toString();
  }
}
