package codingtest.programmers;

import java.util.HashSet;
import java.util.Set;

public class OurPassword {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(solution(s, skip, index));
    }

    public static String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for(char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            char original = c;
            for (int i = 0; i < index; i++) {
                original = (char) (((original - 'a' + 1) % 26) + 'a');
                while (skipSet.contains(original)) {
                    original = (char) (((original - 'a' + 1) % 26) + 'a');
                }
            }
            sb.append(original);
        }
        return sb.toString();
    }
}
