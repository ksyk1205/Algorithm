package codingtest.leetcode;

public class RemoveElements {

  public static void main(String[] args) {
    int[] nums1 = {3,2,2,3};
    int val1 = 3;
    System.out.println(removeElement(nums1, val1)); // 2

    int[] nums2 = {0,1,2,2,3,0,4,2};
    int val2 = 2;
    System.out.println(removeElement(nums2, val2)); // 5
  }

  public static int removeElement(int[] nums, int val) {
    int answer = 0;

    for (int i =0; i<nums.length; i++) {
      if (nums[i] != val) {
        nums[answer] = nums[i];
        answer++;
      }
    }

    return answer;
  }

}
