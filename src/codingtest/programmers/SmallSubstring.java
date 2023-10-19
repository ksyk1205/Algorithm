package codingtest.programmers;

public class SmallSubstring {
    public static void main(String[] args) {
        String t = "10203";
        String p = "15";

        System.out.println(solution(t, p));
    }

    public static int solution(String t, String p) {
        int tLen = t.length();
        int pLen = p.length();
        int cnt = 0;

        for (int i = 0; i <= tLen - pLen; i++) {
            String str = t.substring(i, i + pLen);
            if (Long.parseLong(str) <= Long.parseLong(p)) {
                cnt++;
            }
        }

        return cnt;
    }
}
