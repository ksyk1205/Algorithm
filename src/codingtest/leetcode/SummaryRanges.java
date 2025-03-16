package codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

  public static void main(String[] args) {
    int[] nums1 = {0, 1, 2, 4, 5, 7};
    int[] nums2 = {0, 2, 3, 4, 6, 8, 9};

    System.out.println(summaryRanges(nums1)); // ["0->2", "4->5", "7"]
    System.out.println(summaryRanges(nums2)); // ["0", "2->4", "6", "8->9"]
  }

  private static List<String> summaryRanges(int[] nums) {
    List<String> result = new ArrayList<>();
    if (nums.length == 0) {
      return result;
    }

    int start = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1] + 1) {
        if (start == nums[i - 1]) {
          result.add(String.valueOf(start));
        } else {
          result.add(start + "->" + nums[i - 1]);
        }
        start = nums[i];
      }
    }

    if (start == nums[nums.length - 1]) {
      result.add(String.valueOf(start));
    } else {
      result.add(start + "->" + nums[nums.length - 1]);
    }
    return result;
  }
}
