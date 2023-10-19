package study;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution1Tests {
  /**
   * Example 1:
   * Input: nums = [2,7,11,15], target = 9
   * Output: [0,1]
   * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
   * 
   * Example 2:
   * Input: nums = [3,2,4], target = 6
   * Output: [1,2]
   * 
   * Example 3:
   * Input: nums = [3,3], target = 6
   * Output: [0,1]
   */
  @Test
  public void testTwoSum() {
    Solution1 solution = new Solution1();
    int[] expected1 = new int[] { 0, 1 };
    int[] expected2 = new int[] { 1, 2 };
    int[] expected3 = new int[] { 0, 1 };
    int[] actual1 = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);
    int[] actual2 = solution.twoSum(new int[] { 3, 2, 4 }, 6);
    int[] actual3 = solution.twoSum(new int[] { 3, 3 }, 6);
    Arrays.sort(actual1);
    Arrays.sort(actual2);
    Arrays.sort(actual3);
    Assertions.assertArrayEquals(expected1, actual1);
    Assertions.assertArrayEquals(expected2, actual2);
    Assertions.assertArrayEquals(expected3, actual3);
  }
}
