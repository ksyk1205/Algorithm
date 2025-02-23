package codingtest.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/symmetric-tree/submissions/1552685618/
 */

public class SymmetricTree {
  static class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(3);

    System.out.println(isSymmetric(root)); // true

    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    root2.right = new TreeNode(2);
    root2.left.right = new TreeNode(3);
    root2.right.right = new TreeNode(3);

    System.out.println(isSymmetric(root2)); // false

    TreeNode root3 = new TreeNode(9);
    root3.left = new TreeNode(-42);
    root3.right = new TreeNode(-42);
    root3.left.right = new TreeNode(76);
    root3.right.left = new TreeNode(76);
    root3.left.right.left = new TreeNode(13);
    root3.right.left.left = new TreeNode(13);

    System.out.println(isSymmetric(root3)); // false
  }

  public static boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();

    queue.add(root.left);
    queue.add(root.right);

    while (queue.size() > 0) {
      TreeNode rightNode = queue.poll();
      TreeNode leftNode = queue.poll();

      if (rightNode == null && leftNode == null) {
        continue;
      }
      if (rightNode == null || leftNode == null || rightNode.val != leftNode.val) {
        return false;
      }

      queue.offer(rightNode.left);
      queue.offer(leftNode.right);
      queue.offer(rightNode.right);
      queue.offer(leftNode.left);
    }

    return true;
  }

}
