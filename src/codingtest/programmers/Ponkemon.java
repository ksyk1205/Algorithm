package codingtest.programmers;

import java.util.HashSet;
import java.util.Set;

public class Ponkemon {
  public static void main(String[] args) {
    int[] nums = {3,3,3,2,2,4};
    int result = solution(nums);

    System.out.println(result);
  }

  public static int solution(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for(int num : nums){
      set.add(num);
    }
    if(set.size()>nums.length/2){
      return nums.length/2;
    }else {
      return set.size();
    }
  }

}
