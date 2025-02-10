package codingtest.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
 */

public class MaximumDepthOfBinaryTree {

  public static void main(String[] args) {
    // root = [3,9,20,null,null,15,7]
    TreeNode root1 = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7))
    );
    System.out.println(maxDepth(root1)); // 3

    // root = [1, null, 2]
    TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
    System.out.println(maxDepth(root2)); // 2

    // root = [1]
    TreeNode root3 = new TreeNode(1);
    System.out.println(maxDepth(root3)); // 1
  }

  public static int maxDepth(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    int depth = 0;

    while (queue.size() > 0) {
      depth++;
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        if (poll.left != null) {
          queue.offer(poll.left);
        }
        if (poll.right != null) {
          queue.offer(poll.right);
        }
      }
    }
    return depth;
  }

}

