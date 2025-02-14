package codingtest.leetcode;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class BestTimetoBuyandSellStock {

  public static void main(String[] args) {
    int[] prices1 = {7,1,5,3,6,4};
    System.out.println(maxProfit(prices1)); // 5

    int[] prices2 = {7,6,4,3,1};
    System.out.println(maxProfit(prices2)); // 0
  }
  public static int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int result = 0;

    for (int price: prices) {
      if (price < minPrice) {
        minPrice = price;
      } else if (price - minPrice > result) {
        result = price - minPrice;
      }
    }
    return  result;
  }
}
