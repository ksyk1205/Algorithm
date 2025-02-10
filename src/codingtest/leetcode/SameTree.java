package codingtest.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

  public static void main(String[] args) {
    // Test Case 1: p = [1,2,3], q = [1,2,3]
    TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    System.out.println(isSameTree(p1, q1)); // true

    // Test Case 2: p = [1,2], q = [1,null,2]
    TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
    TreeNode q2 = new TreeNode(1, null, new TreeNode(2));
    System.out.println(isSameTree(p2, q2)); // false

    // Test Case 3: p = [1,2,1], q = [1,1,2]
    TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
    TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
    System.out.println(isSameTree(p3, q3)); // false

  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    Queue<TreeNode> pQueue = new LinkedList<>();
    pQueue.add(p);
    Queue<TreeNode> qQueue = new LinkedList<>();
    qQueue.add(q);

    while (pQueue.size() > 0 && qQueue.size() > 0) {
      int pSize = pQueue.size();
      int qSize = qQueue.size();

      if (pSize != qSize) {
        return false;
      }

      for (int i = 0; i < pSize; i++) {
        TreeNode pPoll = pQueue.poll();
        TreeNode qPoll = qQueue.poll();

        if (pPoll == null && qPoll == null) {
          continue;
        }

        if (pPoll == null || qPoll == null || qPoll.val != pPoll.val) {
          return false;
        }

        pQueue.offer(pPoll.left);
        pQueue.offer(pPoll.right);
        qQueue.offer(qPoll.left);
        qQueue.offer(qPoll.right);
      }

    }
    return true;
  }
}
