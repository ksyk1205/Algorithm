package codingtest.programmers;

import java.util.HashMap;
import java.util.Map;

public class ALotOfGift {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        int solution = solution(friends, gifts);

        System.out.println(solution);
    }

    public static int solution(String[] friends, String[] gifts) {
        Map<String, Integer> friendIndexMap = new HashMap<>();
        int[][] giftRecord = new int[friends.length][friends.length];
        int[] giftIndex = new int[friends.length];

        // 친구의 이름과 인덱스를 매핑한 맵 생성
        for (int i = 0; i < friends.length; i++) {
            friendIndexMap.put(friends[i], i);
        }

        // 선물 주고 받은 기록 및 선물 지수 업데이트
        for (String gift : gifts) {
            String[] splitGift = gift.split(" ");
            String giver = splitGift[0];
            String receiver = splitGift[1];
            int giverIndex = friendIndexMap.get(giver);
            int receiverIndex = friendIndexMap.get(receiver);
            giftIndex[giverIndex]++;
            giftIndex[receiverIndex]--;
            giftRecord[giverIndex][receiverIndex]++;
        }

        // 각 친구가 받을 선물 개수 계산
        int maxGifts = 0;
        for (int i = 0; i < friends.length; i++) {
            int cnt = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i != j) {
                    if (giftRecord[i][j] > giftRecord[j][i] || (giftRecord[i][j] == giftRecord[j][i] && giftIndex[i] > giftIndex[j])) {
                        cnt++;
                    }
                }
            }
            maxGifts = Math.max(maxGifts, cnt);
        }
        return maxGifts;
    }
}
