package study;

public class Solution2 {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  /**
   * https://leetcode.com/problems/add-two-numbers/
   * 
   * You are given two non-empty linked lists representing two non-negative
   * integers. The digits are stored in reverse order, and each of their nodes
   * contains a single digit. Add the two numbers and return the sum as a linked
   * list.
   * 
   * You may assume the two numbers do not contain any leading zero, except the
   * number 0 itself.
   * 
   * Constraints:
   * The number of nodes in each linked list is in the range [1, 100].
   * 0 <= Node.val <= 9
   * It is guaranteed that the list represents a number that does not have leading
   * zeros.
   * 
   * @param l1
   * @param l2
   * @return
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode head = null;
    ListNode current = null;

    while (l1 != null || l2 != null) {
      int value1 = l1 != null ? l1.val : 0;
      int value2 = l2 != null ? l2.val : 0;
      int sum = value1 + value2 + carry;

      ListNode node = new ListNode(sum % 10);
      if (current == null) {
        head = node;
        current = node;
      } else {
        current.next = node;
        current = node;
      }

      carry = sum >= 10 ? 1 : 0;
      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;
    }

    if (carry > 0) {
      current.next = new ListNode(carry);
    }

    return head;
  }
}
