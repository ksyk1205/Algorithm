package codingtest.leetcode;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int[] nums1 = {1,2,3,4,5,6,7};
    rotate(nums1, 3); // nums {5,6,7,1,2,3,4}

    System.out.println(Arrays.toString(nums1));

    int[] nums2 = {-1,-100,3,99};
    rotate(nums2, 2); // nums {3,99,-1,-100}
    System.out.println(Arrays.toString(nums2));
  }

  public static void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;

    reverse(nums, 0, n-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, n-1);

  }

  private static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int num = nums[start];
      nums[start] = nums[end];
      nums[end] = num;
      start++;
      end--;
    }
  }

}
