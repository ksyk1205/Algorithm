package codingtest.leetcode;

public class LengthofLastWord {
  public static void main(String[] args) {
    String str1 = "Hello World";
    System.out.println(lengthOfLastWord(str1));

    String str2 = "   fly me   to   the moon  ";
    System.out.println(lengthOfLastWord(str2));

    String str3 = "luffy is still joyboy";
    System.out.println(lengthOfLastWord(str3));
  }

  public static int lengthOfLastWord(String s) {
    String[] strArr  = s.split(" ");

    return strArr[strArr.length-1].length();
  }
}
