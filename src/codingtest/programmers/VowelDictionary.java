package codingtest.programmers;

public class VowelDictionary {
  public static void main(String[] args) {
    System.out.println(solution("AAAAE"));
    System.out.println(solution("AAAE"));
    System.out.println(solution("I"));
    System.out.println(solution("EIO"));
  }

  public static int solution(String word) {
    String[] vowels = {"A", "E", "I", "O", "U"};
    int[] positionWeights = {781, 156, 31, 6, 1};

    int answer = 0;

    for (int i = 0; i < word.length(); i++) {
      int idx = "AEIOU".indexOf(word.charAt(i));
      answer += idx * positionWeights[i] + 1;
    }

    return answer;
  }
}



