package codingtest.leetcode;

/**
 * https://leetcode.com/problems/add-two-numbers/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class AddTwoNumbers {
  static class ListNode {

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
  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));


//    printList(addTwoNumbers(l1, l2));  // 708

    ListNode l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
    ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

    printList(addTwoNumbers(l3, l4)); //89990001
  }

  public static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.val);
      node = node.next;
    }
    System.out.println();
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode();
    ListNode tail = result;

    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
      int val1 = (l1 != null) ? l1.val : 0;
      int val2 = (l2 != null) ? l2.val : 0;

      int sum = val1 + val2 + carry;
      carry = sum / 10;
      int digit = sum % 10;

      tail.next = new ListNode(digit);
      tail = tail.next;

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
    }

    return result.next;
  }

}
