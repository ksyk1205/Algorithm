package codingtest.programmers;

public class MagicalElevator {

  public static void main(String[] args) {
    System.out.println(solution(16));   // 결과 6
    System.out.println(solution(2554)); // 결과 16
  }

  public static int solution(int storey) {
    int magic = 0;

    while (storey > 0) {
      int digit = storey % 10;
      int nextDigit = (storey / 10) % 10;

      if (digit > 5 || (digit == 5 && nextDigit >= 5)) {
        magic += (10 - digit);
        storey += (10 - digit);
      } else {
        magic += digit;
      }
      storey /= 10;
    }

    return magic;
  }
}
