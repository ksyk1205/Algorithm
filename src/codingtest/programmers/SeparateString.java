package codingtest.programmers;

public class SeparateString {
    public static void main(String[] args) {
        String s = "abracadabra";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int cnt = 0;
        int current = 0;
        char firstChar = s.charAt(0);

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (firstChar == charArray[i]) {
                current++;
            } else {
                current--;
            }
            if (current == 0 || i==charArray.length-1) {
                cnt++;
                if (i + 1 < charArray.length) {
                    firstChar = charArray[i + 1];
                }
            }
        }
        return cnt;
    }
}
