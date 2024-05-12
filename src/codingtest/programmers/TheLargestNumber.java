package codingtest.programmers;

import java.util.Arrays;

public class TheLargestNumber {
  public static void main(String[] args) {
    int[] numbers = {3, 30, 34, 5, 9};
    String result = solution(numbers);
    System.out.println(result);
  }

  public static String solution(int[] numbers) {
    String[] strings = new String[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      strings[i] = String.valueOf(numbers[i]);
    }

    Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

    String answer = "";
    for (String s : strings) {
      answer += s;
    }

    return answer;
  }

}
