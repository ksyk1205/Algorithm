package codingtest.programmers;

import java.util.HashSet;
import java.util.Set;

public class EnglishWordChain {

  public static void main(String[] args) {
    int n = 3;
    String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

    int[] result = solution(n, words);
    for (int i : result) {
      System.out.println(i);
    }
  }

  private static int[] solution(int n, String[] words) {
    Set<String> useWords = new HashSet<>();
    useWords.add(words[0]);

    for (int i = 1; i < words.length; i++) {
      String preWord = words[i - 1];
      String currentWord = words[i];

      if (useWords.contains(currentWord)) {
        return new int[]{(i % n) + 1, (i / n) + 1};
      }

      if (preWord.charAt(preWord.length() - 1) != currentWord.charAt(0)) {
        return new int[]{(i % n) + 1, (i / n) + 1};
      }
      useWords.add(words[i]);
    }
    return new int[]{0, 0};
  }
}
