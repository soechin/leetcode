package study;

public class Solution1 {
  /**
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
   * 
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    for (int i = 1; i < nums.length; i++) {
      int value = target - nums[i];

      for (int j = 0; j < i; j++) {
        if (nums[j] == value) {
          return new int[] { i, j };
        }
      }
    }

    throw new RuntimeException("無解");
  }
}
