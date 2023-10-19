package study;

import java.util.HashMap;

public class Solution1 {
  /*
   * https://leetcode.com/problems/two-sum/
   * 
   * Given an array of integers nums and an integer target, return indices of the
   * two numbers such that they add up to target.
   * 
   * You may assume that each input would have exactly one solution, and you may
   * not use the same element twice.
   * 
   * You can return the answer in any order.
   * 
   * Constraints:
   * 2 <= nums.length <= 104
   * -109 <= nums[i] <= 109
   * -109 <= target <= 109
   * Only one valid answer exists.
   * 
   * Follow-up: Can you come up with an algorithm that is less than O(n2) time
   * complexity?
   */
  /**
   * O(n)
   * 
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int rem = target - nums[i];

      if (map.containsKey(rem)) {
        return new int[] { i, map.get(rem) };
      }

      map.put(nums[i], i);
    }

    throw new RuntimeException("無解");
  }

  /**
   * O(n^2)
   * 
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum1(int[] nums, int target) {
    for (int i = 1; i < nums.length; i++) {
      int rem = target - nums[i];

      for (int j = 0; j < i; j++) {
        if (nums[j] == rem) {
          return new int[] { i, j };
        }
      }
    }

    throw new RuntimeException("無解");
  }
}
