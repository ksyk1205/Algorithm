package codingtest.leetcode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveDuplicatesFromSortedArray2 {

  public static void main(String[] args) {
    int[] nums1 = {1, 1, 1, 2, 2, 3};
    System.out.println(removeDuplicates(nums1)); // 5

    int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    System.out.println(removeDuplicates(nums2)); // 7
  }

  public static int removeDuplicates(int[] nums) {
    int i = 0;
    int dup = 1;

    for (int j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
        dup = 1;
      } else {
        if (dup < 2) {
          i++;
          nums[i] = nums[j];
          dup++;
        }
      }
    }
    return i + 1;
  }
}
