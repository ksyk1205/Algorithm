package codingtest.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    int[] nums1 = {2,7,11,15};
    int target1 = 9;
    System.out.println(twoSum(nums1, target1));

    int[] nums2 = {3,2,4};
    int target2 = 6;
    System.out.println(twoSum(nums2, target2));


    int[] nums3 = {3,3};
    int target3 = 6;
    System.out.println(twoSum(nums3, target3));
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i=0; i<nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i=0; i<nums.length; i++) {
      int sum = target - nums[i];
      if (map.containsKey(sum) && map.get(sum)!=i) {
        return new int[]{i, map.get(sum)};
      }

    }

    return new int[]{0,0};
  }

}
