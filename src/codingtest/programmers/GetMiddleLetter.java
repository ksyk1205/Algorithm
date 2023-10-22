package codingtest.programmers;

public class GetMiddleLetter {
    public static void main(String[] args) {
        String s= "abcde";

        System.out.println(solution(s));

    }
    public static String solution(String s) {
        if(s.length()%2==0){
            return s.substring(s.length()/2-1,s.length()/2+1);
        }else{
            return  s.substring(s.length()/2,s.length()/2+1);
        }
    }

}
