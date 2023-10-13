package codingtest.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};

        int[] result = solution(name, yearning, photo);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }


        int[] result = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int score = 0;

            for (String person : photo[i]) {
                if (map.containsKey(person)) {
                    score += map.get(person);
                }
                result[i] = score;
            }

        }
        return result;
    }
}
