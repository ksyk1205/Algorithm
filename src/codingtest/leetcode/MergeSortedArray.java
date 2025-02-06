package codingtest.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    int m = 3, n = 3;

    merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]

    int[] nums3 = {1};
    int[] nums4 = {};
    merge(nums3, 1, nums4, 0);
    System.out.println(Arrays.toString(nums3)); // [1]

    int[] nums5 = {0};
    int[] nums6 = {1};
    merge(nums5, 0, nums6, 1);
    System.out.println(Arrays.toString(nums5)); // [1]
  }

  public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (j >= 0) {
      if (i >= 0 && nums1[i] > nums2[j]) {
        nums1[k] = nums1[i];
        i--;
      } else {
        nums1[k] = nums2[j];
        j--;
      }
      k--;
    }

    return nums1;
  }
}
