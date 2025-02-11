package codingtest.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

  public static void main(String[] args) {
    System.out.println(wordPattern("abba", "dog cat cat dog")); //true
    System.out.println(wordPattern("abba", "dog cat cat fish")); //false
    System.out.println(wordPattern("aaaa", "dog cat cat dog")); //false
  }

  public static boolean wordPattern(String pattern, String s) {
    String[] strArray = s.split(" ");

    if (pattern.length() != strArray.length) {
      return false;
    }
    Map<Character, String> map = new HashMap<>();
    Map<String, Character> reverseMap = new HashMap<>();

    for (int i = 0; i < strArray.length; i++) {
      char a = pattern.charAt(i);
      String str = strArray[i];

      if (map.containsKey(a) && !map.get(a).equals(str)) {
        return false;
      }

      if (reverseMap.containsKey(str) && !reverseMap.get(str).equals(a)) {
        return false;
      }

      map.put(a, str);
      reverseMap.put(str, a);
    }
    return true;
  }

}
