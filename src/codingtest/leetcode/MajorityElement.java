package codingtest.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class MajorityElement {

  public static void main(String[] args) {
    int[] nums1 = {3,2,3};
    System.out.println(majorityElement(nums1)); // 3

    int[] nums2 = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(nums2)); // 2

  }

  public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length/2];
  }
}
