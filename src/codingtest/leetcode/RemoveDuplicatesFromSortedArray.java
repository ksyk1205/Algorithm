package codingtest.leetcode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    int[] nums1 = {1, 1, 2};
    System.out.println(removeDuplicates(nums1)); // 2

    int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println(removeDuplicates(nums2)); // 5
  }

  public static int removeDuplicates(int[] nums) {
    int i = 0;

    for (int k = 1; k < nums.length; k++) {
      if (nums[i] != nums[k]) {
        i++;
        nums[i] = nums[k];
      }
    }

    return i + 1;
  }
}
