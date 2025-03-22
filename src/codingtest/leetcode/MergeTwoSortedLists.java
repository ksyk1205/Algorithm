package codingtest.leetcode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan-v2&envId=top-interview-150
 */

public class MergeTwoSortedLists {

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
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

    printList(mergeTwoLists(list1, list2));
  }

  public static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.val);
      if (node.next != null) {
        System.out.print(" -> ");
      }
      node = node.next;
    }
    System.out.println();
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode result = new ListNode();
    ListNode tail = result;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }

    tail.next = (list1 != null) ? list1 : list2;

    return result.next;
  }
}
