package codingtest.programmers;

public class TakeOutDeliveryBox {

  public static void main(String[] args) {

    System.out.println(solution(22, 6, 8)); // 3
    System.out.println(solution(13, 3, 6)); // 4

  }

  public static int solution(int n, int w, int num) {
    int answer = 0;

    int h = (int) Math.ceil((double) n / w);
    int[][] box = new int[h][w];

    int index = 1;
    for (int i = 0; i < h; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < w && index <= n; j++) {
          box[i][j] = index++;
        }
      } else {
        for (int j = w - 1; j >= 0 && index <= n; j--) {
          box[i][j] = index++;
        }
      }
    }

    int targetCol = -1, targetRow = -1;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (box[i][j] == num) {
          targetRow = i;
          targetCol = j;
          break;
        }
      }

      if (targetRow != -1) {
        break;
      }
    }

    for (int i = targetRow; i < h; i++) {
      if (box[i][targetCol] != 0) {
        answer++;
      }
    }

    return answer;
  }

}
