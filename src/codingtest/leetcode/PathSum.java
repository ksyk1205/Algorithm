package codingtest.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/path-sum/submissions/1557963956/
 */

public class PathSum {

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
    TreeNode treeNode = new TreeNode(5);
    treeNode.left = new TreeNode(4);
    treeNode.left.left = new TreeNode(11);
    treeNode.left.left.left = new TreeNode(7);
    treeNode.left.left.right = new TreeNode(2);
    treeNode.right = new TreeNode(8);
    treeNode.right.left = new TreeNode(13);
    treeNode.right.right = new TreeNode(4);
    treeNode.right.right.right = new TreeNode(1);

    System.out.println(hasPathSum(treeNode, 22)); //true
    System.out.println(hasPathSumDFS(treeNode, 22)); //true

    TreeNode treeNode2 = new TreeNode(1);
    treeNode2.left = new TreeNode(2);
    treeNode2.right = new TreeNode(3);

    System.out.println(hasPathSum(treeNode2, 5)); // false
    System.out.println(hasPathSumDFS(treeNode2, 5)); // false
  }


  public static boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return targetSum == 0;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    Queue<Integer> sumQueue = new LinkedList<>();
    queue.add(root);
    sumQueue.add(targetSum - root.val);

    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      Integer sum = sumQueue.poll();

      if (node.right == null && node.left == null && sum == 0) {
        return true;
      }

      if (node.left != null) {
        queue.add(node.left);
        sumQueue.add(sum - node.left.val);
      }

      if (node.right != null) {
        queue.add(node.right);
        sumQueue.add(sum - node.right.val);
      }
    }

    return false;
  }

  public static boolean hasPathSumDFS(TreeNode root, int targetSum) {
    if (root == null) return false;

    if (root.left == null && root.right == null) {
      return targetSum == root.val;
    }

     boolean left = root.left != null && hasPathSumDFS(root.left, targetSum-root.val);
     boolean right = root.right != null && hasPathSumDFS(root.right, targetSum-root.val);

     return left || right;
  }

}
