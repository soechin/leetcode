package study;

import java.util.Arrays;

public class Solution4 {
  /**
   * https://leetcode.com/problems/median-of-two-sorted-arrays/
   * 
   * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
   * the median of the two sorted arrays.
   * 
   * The overall run time complexity should be O(log (m+n)).
   * 
   * Constraints:
   * nums1.length == m
   * nums2.length == n
   * 0 <= m <= 1000
   * 0 <= n <= 1000
   * 1 <= m + n <= 2000
   * -106 <= nums1[i], nums2[i] <= 106
   * 
   * @param nums1
   * @param nums2
   * @return
   */
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] nums = new int[nums1.length + nums2.length];
    System.arraycopy(nums1, 0, nums, 0, nums1.length);
    System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
    Arrays.sort(nums);

    int mid = (nums.length - 1) / 2;
    if (nums.length % 2 == 0) {
      return (double) (nums[mid] + nums[mid + 1]) / 2;
    } else {
      return nums[mid];
    }
  }
}
