package codingtest.programmers;

public class Carpet {

  public static void main(String[] args) {
    int brown = 10;
    int yellow = 2;
    int[] answer = solution(brown, yellow);

    for (int i : answer) {
      System.out.println(i);
    }

  }

  public static int[] solution(int brown, int yellow) {
    int[] answer = new int[2];

    int total = brown + yellow;

    for (int i = 1; i <= total; i++) {
      if (total % i == 0) {
        int width = total / i;
        int height = i;

        if ((width - 2) * (height - 2) == yellow) {
          answer[0] = width;
          answer[1] = height;
          break;
        }
      }
    }
    return answer;
  }
}
