package codingtest.leetcode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 */

public class MinimumDepthOfBinaryTree {

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

//    System.out.println(minDepthBFS(root)); // 2
    System.out.println(minDepthDFS(root)); // 2

    TreeNode root2 = new TreeNode(2);
    root2.right = new TreeNode(3);
    root2.right.right = new TreeNode(4);
    root2.right.right.right = new TreeNode(5);
    root2.right.right.right.right = new TreeNode(6);

//    System.out.println(minDepthBFS(root2)); // 5
    System.out.println(minDepthDFS(root2)); // 5


  }

  public static int minDepthBFS(TreeNode root) {
    if (root == null) return 0;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    int depth = 1;

    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();

        if (node.left == null && node.right == null) {
          return depth;
        }

        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }

      depth++;
    }

    return depth;
  }

  public static int minDepthDFS(TreeNode root) {
    if (root == null) return 0;

    if (root.left == null && root.right == null) return 1;

    if (root.left == null) return minDepthDFS(root.right) + 1;
    if (root.right == null) return  minDepthDFS(root.left) +1;

    return Math.min(minDepthDFS(root.left), minDepthDFS(root.right)) + 1;
  }


}
