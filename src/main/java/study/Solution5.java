package study;

public class Solution5 {
  /**
   * https://leetcode.com/problems/longest-palindromic-substring/
   * 
   * Given a string s, return the longest palindromic substring in s.
   * 
   * Constraints:
   * 1 <= s.length <= 1000
   * s consist of only digits and English letters.
   * 
   * @param s
   * @return
   */
  public String longestPalindrome(String s) {
    int maxLength = 0;
    String maxResult = "";

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + maxLength; j < s.length(); j++) {
        boolean isPalindrome = true;
        int left = i;
        int right = j;

        while (left < right) {
          if (s.charAt(left) != s.charAt(right)) {
            isPalindrome = false;
            break;
          }

          left++;
          right--;
        }

        if (isPalindrome) {
          maxLength = j - i + 1;
          maxResult = s.substring(i, j + 1);
        }
      }
    }

    return maxResult;
  }
}
