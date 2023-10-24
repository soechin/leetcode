package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution4Tests {
  /**
   * Example 1:
   * Input: nums1 = [1,3], nums2 = [2]
   * Output: 2.00000
   * Explanation: merged array = [1,2,3] and median is 2.
   */
  @Test
  public void findMedianSortedArrays1() {
    Solution4 solution = new Solution4();
    int[] nums1 = { 1, 3 };
    int[] nums2 = { 2 };
    double expected = 2.00000;
    double actual = solution.findMedianSortedArrays(nums1, nums2);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Example 2:
   * Input: nums1 = [1,2], nums2 = [3,4]
   * Output: 2.50000
   * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
   */
  @Test
  public void findMedianSortedArrays2() {
    Solution4 solution = new Solution4();
    int[] nums1 = { 1, 2 };
    int[] nums2 = { 3, 4 };
    double expected = 2.50000;
    double actual = solution.findMedianSortedArrays(nums1, nums2);
    Assertions.assertEquals(expected, actual);
  }
}
