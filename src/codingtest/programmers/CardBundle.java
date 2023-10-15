package codingtest.programmers;

import java.util.HashSet;
import java.util.Set;

public class CardBundle {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Set<String> cardSet = new HashSet<>();
        for (String card : cards1) {
            cardSet.add(card);
        }
        for (String card : cards2) {
            cardSet.add(card);
        }

        int card1Index = 0, card2Index = 0;
        for (String word : goal) {
            if (card1Index < cards1.length && cards1[card1Index].equals(word)) {
                card1Index++;
            } else if (card2Index < cards2.length && cards2[card2Index].equals(word)) {
                card2Index++;
            } else {
                return "No";
            }

            if (!cardSet.contains(word)) {
                return "No";
            }

            cardSet.remove(word);
        }
        return "Yes";
    }
}
