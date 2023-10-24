package codingtest.programmers;

import java.util.*;

public class RunningRace {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
    }

    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> orderMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            orderMap.put(players[i], i);
        }

        for (String calling : callings) {
            int index = orderMap.get(calling);
            if (index > 0) {
                String temp = players[index - 1];
                players[index - 1] = calling;
                players[index] = temp;
                orderMap.put(calling, index - 1);
                orderMap.put(temp, index);
            }
        }

        return players;
    }

}
