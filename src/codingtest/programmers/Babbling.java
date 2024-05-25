package codingtest.programmers;

public class Babbling {

  public static void main(String[] args) {
    String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

    System.out.println(solution(babbling));
  }

  private static int solution(String[] babbling) {
    String[] validWord = {"aya", "ye", "woo", "ma"};
    int answer = 0;

    for (String babble : babbling) {
      String originalWord = babble;
      boolean isValid = true;

      for (String word : validWord) {
        if (originalWord.contains(word + word)) {
          isValid = false;
          break;
        }
        originalWord = originalWord.replace(word," ");
      }

      if (isValid && originalWord.trim().isEmpty()) {
        answer++;
      }
    }

    return answer;
  }

}
