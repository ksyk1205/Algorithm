package codingtest.leetcode;

public class BestTimeToBuyAndSellStock2 {

  public static void main(String[] args) {
    int[] prices1 = {7,1,5,3,6,4};

    System.out.println(maxProfit(prices1)); // 7

    int[] prices2 = {1,2,3,4,5};

    System.out.println(maxProfit(prices2)); // 4

    int[] prices3 = {7,6,4,3,1};

    System.out.println(maxProfit(prices3)); // 0
  }

  public static int maxProfit(int[] prices) {
    int result = 0;

    for (int i=1; i<prices.length; i++) {
      if (prices[i] > prices[i-1]) {
        result += prices[i] - prices[i-1];
      }
    }

    return result;
  }
}
