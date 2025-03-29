package codingtest.leetcode;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

  public static void main(String[] args) {
    String haystack = "sadbutsad", needle = "sad";

    System.out.println(strStr2(haystack, needle)); //0

    String haystack2 = "leetcode", needle2 = "leeto";

    System.out.println(strStr2(haystack2, needle2)); //-1
  }

  public static int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }

  public static int strStr2(String haystack, String needle) {
    int hLength = haystack.length();
    int nLength = needle.length();

    for (int i = 0; i < hLength - nLength; i++) {
      int j = 0;
      while (j < nLength && haystack.charAt(i+j) == needle.charAt(j)) {
        j++;
      }
      if (j == nLength) return i;
    }

    return -1;
  }

}
