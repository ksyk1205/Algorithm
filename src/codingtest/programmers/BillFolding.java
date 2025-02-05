package codingtest.programmers;

public class BillFolding {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{30, 15}, new int[]{26, 17})); // 1
    System.out.println(solution(new int[]{50, 50}, new int[]{100, 241})); // 4
  }

  public static int solution(int[] wallet, int[] bill) {
    int answer = 0;

    while (true) {
      int walletMax = Math.max(wallet[0], wallet[1]);
      int walletMin = Math.min(wallet[0], wallet[1]);
      int billMax = Math.max(bill[0], bill[1]);
      int billMin = Math.min(bill[0], bill[1]);

      if (walletMax < billMax || walletMin < billMin) {
        if (bill[0] > bill[1]) {
          bill[0] = bill[0] / 2;
        } else {
          bill[1] = bill[1] / 2;
        }
        answer++;
      } else {
        break;
      }
    }

    return answer;
  }
}
