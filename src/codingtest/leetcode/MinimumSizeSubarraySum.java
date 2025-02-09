package codingtest.leetcode;

/**
 *  https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class MinimumSizeSubarraySum {

  public static void main(String[] args) {
    int[] nums1 = {2, 3, 1, 2, 4, 3};
    System.out.println(minSubArrayLen(7, nums1)); // 2

    int[] nums2 = {1,4,4};
    System.out.println(minSubArrayLen(4, nums2)); // 1

    int[] nums3 = {1,1,1,1,1,1,1,1};
    System.out.println(minSubArrayLen(11, nums3)); // 0

    int[] nums5 = {1, 2, 3, 4, 5};
    System.out.println(minSubArrayLen(11, nums5));
  }

  public static int minSubArrayLen(int target, int[] nums) {
    int left = 0, sum = 0;
    int min = Integer.MAX_VALUE;

    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];

      while (target <= sum) {
        min = Math.min(min, right - left + 1);
        sum -= nums[left];
        left++;
      }

    }

    return min == Integer.MAX_VALUE ? 0: min;
  }

}
