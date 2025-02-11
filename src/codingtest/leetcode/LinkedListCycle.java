package codingtest.leetcode;

/**
 * https://leetcode.com/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class LinkedListCycle {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(3);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(0);
    ListNode node4 = new ListNode(-4);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node2;

    System.out.println(hasCycle(node1)); // true

    ListNode nodeA = new ListNode(1);
    ListNode nodeB = new ListNode(2);
    nodeA.next = nodeB;
    nodeB.next = nodeA;

    System.out.println(hasCycle(nodeA)); // true

    ListNode singleNode = new ListNode(1);

    System.out.println(hasCycle(singleNode)); // false;
  }

  public static boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) return false;

    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true;
      }
    }
    return false;
  }
}
