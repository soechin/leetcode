package study;

public class Solution3 {
  /**
   * https://leetcode.com/problems/longest-substring-without-repeating-characters/
   * 
   * Given a string s, find the length of the longest substring without repeating
   * characters.
   * 
   * Constraints:
   * 0 <= s.length <= 5 * 104
   * s consists of English letters, digits, symbols and spaces.
   * 
   * @param s
   * @return
   */
  public int lengthOfLongestSubstring(String s) {
    String chars = "";
    int max = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int p = chars.indexOf(c);

      chars += c;

      if (p < 0) {
        if (chars.length() > max) {
          max = chars.length();
        }
      } else {
        chars = chars.substring(p + 1);
      }
    }

    return max;
  }
}
