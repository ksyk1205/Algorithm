package codingtest.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NearestSameLetter {
    public static void main(String[] args) {
        String s = "banana";
        int[] result = solution(s);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String s) {
        int[] result = new int[s.length()];
        Arrays.fill(result, -1);

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                int prevIndex = map.get(c);
                result[i] = i -prevIndex;
            }
            map.put(c, i);
        }
        return result;
    }
}
