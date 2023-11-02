package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution5Tests {
  /**
   * Example 1:
   * Input: s = "babad"
   * Output: "bab"
   * Explanation: "aba" is also a valid answer.
   */
  @Test
  public void longestPalindrome1() {
    Solution5 solution = new Solution5();
    String expected = "bab";
    String actual = solution.longestPalindrome("babad");
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Example 2:
   * 
   * Input: s = "cbbd"
   * Output: "bb"
   */
  @Test
  public void longestPalindrome2() {
    Solution5 solution = new Solution5();
    String expected = "bb";
    String actual = solution.longestPalindrome("cbbd");
    Assertions.assertEquals(expected, actual);
  }
}
