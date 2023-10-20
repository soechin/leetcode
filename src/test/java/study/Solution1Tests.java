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
   */
  @Test
  public void twoSum1() {
    Solution1 solution = new Solution1();
    int[] expected = new int[] { 0, 1 };
    int[] actual = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);
    Arrays.sort(actual);
    Assertions.assertArrayEquals(expected, actual);
  }

  /**
   * Example 2:
   * Input: nums = [3,2,4], target = 6
   * Output: [1,2]
   */
  @Test
  public void twoSum2() {
    Solution1 solution = new Solution1();
    int[] expected = new int[] { 1, 2 };
    int[] actual = solution.twoSum(new int[] { 3, 2, 4 }, 6);
    Arrays.sort(actual);
    Assertions.assertArrayEquals(expected, actual);
  }

  /**
   * Example 3:
   * Input: nums = [3,3], target = 6
   * Output: [0,1]
   */
  @Test
  public void twoSum3() {
    Solution1 solution = new Solution1();
    int[] expected = new int[] { 0, 1 };
    int[] actual = solution.twoSum(new int[] { 3, 3 }, 6);
    Arrays.sort(actual);
    Assertions.assertArrayEquals(expected, actual);
  }
}
