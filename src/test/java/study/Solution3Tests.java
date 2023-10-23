package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution3Tests {
  /**
   * Example 1:
   * Input: s = "abcabcbb"
   * Output: 3
   * Explanation: The answer is "abc", with the length of 3.
   */
  @Test
  public void lengthOfLongestSubstring1() {
    Solution3 solution = new Solution3();
    String s = "abcabcbb";
    int expected = 3;
    int actual = solution.lengthOfLongestSubstring(s);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Example 2:
   * Input: s = "bbbbb"
   * Output: 1
   * Explanation: The answer is "b", with the length of 1.
   */
  @Test
  public void lengthOfLongestSubstring2() {
    Solution3 solution = new Solution3();
    String s = "bbbbb";
    int expected = 1;
    int actual = solution.lengthOfLongestSubstring(s);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Example 3:
   * Input: s = "pwwkew"
   * Output: 3
   * Explanation: The answer is "wke", with the length of 3.
   * Notice that the answer must be a substring, "pwke" is a subsequence and not a
   * substring.
   */
  @Test
  public void lengthOfLongestSubstring3() {
    Solution3 solution = new Solution3();
    String s = "pwwkew";
    int expected = 3;
    int actual = solution.lengthOfLongestSubstring(s);
    Assertions.assertEquals(expected, actual);
  }
}
