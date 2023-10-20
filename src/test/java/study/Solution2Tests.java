package study;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution2Tests {
  /**
   * Example 1:
   * Input: l1 = [2,4,3], l2 = [5,6,4]
   * Output: [7,0,8]
   * Explanation: 342 + 465 = 807.
   */
  @Test
  public void addTwoNumbers1() {
    Solution2 solution = new Solution2();
    Solution2.ListNode l1 = createListNode(new int[] { 2, 4, 3 });
    Solution2.ListNode l2 = createListNode(new int[] { 5, 6, 4 });
    Solution2.ListNode expected = createListNode(new int[] { 7, 0, 8 });
    Solution2.ListNode actual = solution.addTwoNumbers(l1, l2);
    Assertions.assertArrayEquals(createArray(expected), createArray(actual));
  }

  /**
   * Example 2:
   * Input: l1 = [0], l2 = [0]
   * Output: [0]
   */
  @Test
  public void addTwoNumbers2() {
    Solution2 solution = new Solution2();
    Solution2.ListNode l1 = createListNode(new int[] { 0 });
    Solution2.ListNode l2 = createListNode(new int[] { 0 });
    Solution2.ListNode expected = createListNode(new int[] { 0 });
    Solution2.ListNode actual = solution.addTwoNumbers(l1, l2);
    Assertions.assertArrayEquals(createArray(expected), createArray(actual));
  }

  /**
   * Example 3:
   * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
   * Output: [8,9,9,9,0,0,0,1]
   */
  @Test
  public void addTwoNumbers3() {
    Solution2 solution = new Solution2();
    Solution2.ListNode l1 = createListNode(new int[] { 9, 9, 9, 9, 9, 9, 9 });
    Solution2.ListNode l2 = createListNode(new int[] { 9, 9, 9, 9 });
    Solution2.ListNode expected = createListNode(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 });
    Solution2.ListNode actual = solution.addTwoNumbers(l1, l2);
    Assertions.assertArrayEquals(createArray(expected), createArray(actual));
  }

  Solution2.ListNode createListNode(int[] array) {
    Solution2 solution = new Solution2();
    Solution2.ListNode head = solution.new ListNode(array[0]);
    Solution2.ListNode current = head;

    for (int i = 1; i < array.length; i++) {
      current.next = solution.new ListNode(array[i]);
      current = current.next;
    }

    return head;
  }

  int[] createArray(Solution2.ListNode listNode) {
    ArrayList<Integer> arrayList = new ArrayList<>();

    while (listNode != null) {
      arrayList.add(listNode.val);
      listNode = listNode.next;
    }

    return arrayList.stream().mapToInt(Integer::intValue).toArray();
  }
}
