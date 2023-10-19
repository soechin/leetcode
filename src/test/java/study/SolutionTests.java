package study;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTests {
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
    Solution solution = new Solution();
    assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    assertArrayEquals(new int[] { 1, 2 }, solution.twoSum(new int[] { 3, 2, 4 }, 6));
    assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 3, 3 }, 6));
  }
}
