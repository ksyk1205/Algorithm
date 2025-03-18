package codingtest.leetcode;

/**
 *  https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class JumpGameII {

  public static void main(String[] args) {
    int[] nums1 = {2,3,1,1,4};
    System.out.println(jump(nums1));

    int[] nums2 = {2,3,0,1,4};
    System.out.println(jump(nums2));
  }

  public static int jump(int[] nums) {
    int n = nums.length;
    int jumps = 0;
    int position = 0;
    int max = 0;

    for (int i = 0; i < n - 1; i++) {
      max = Math.max(max, i + nums[i]);

      if (i == position) {
        jumps++;
        position = max;
      }
    }

    return jumps;
  }
}
