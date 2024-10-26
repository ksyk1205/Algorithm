package codingtest.programmers;

public class CreateJadenCaseString {

  public static void main(String[] args) {
    System.out.println(solution("3people unFollowed me"));
  }

  public static String solution(String s) {
    String answer = "";
    String ns = " " + s;

    for (int i = 1; i < ns.length(); i++){
      if (ns.charAt(i - 1) == ' '){
        answer += Character.toUpperCase(ns.charAt(i));
      } else {
        answer += Character.toLowerCase(ns.charAt(i));
      }
    }

    return answer;
  }

}
