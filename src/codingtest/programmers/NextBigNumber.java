package codingtest.programmers;

public class NextBigNumber {

  public static void main(String[] args) {
    System.out.println(solution(78));  // 결과 83
    System.out.println(solution(15));  // 결과 23

  }

  public static int solution(int n) {
    int cnt = Integer.bitCount(n);

    for (int i=n+1; i<1000000; i++) {
      int bigCnt = Integer.bitCount(i);
      if (cnt ==bigCnt) {
        return i;
      }
    }
    return 0;
  }

}
