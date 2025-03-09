package codingtest.leetcode;

public class JumpGame {

  public static void main(String[] args) {
    int[] nums1 = {2, 3, 1, 1, 4};

    System.out.println(canJump(nums1)); // true;

    int[] nums2 = {3, 2, 1, 0, 4};

    System.out.println(canJump(nums2)); // false
  }

  public static boolean canJump(int[] nums) {
    int maxValue = 0;

    for (int i = 0; i < nums.length; i++) {
      if (maxValue < i) {
        return false;
      }
      maxValue = Math.max(maxValue, nums[i] + i);

      if (maxValue >= nums.length - 1) {
        return true;
      }
    }

    return false;
  }

}
