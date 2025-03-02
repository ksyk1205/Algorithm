package codingtest.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 */
public class BinaryTreeLevelOrderTraversal2 {

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
    TreeNode root1 = new TreeNode(3);
    root1.left = new TreeNode(9);
    root1.right = new TreeNode(20);
    root1.right.left = new TreeNode(15);
    root1.right.right = new TreeNode(7);

    System.out.println(levelOrderBottom(root1)); //[[15,7],[9,20],[3]]
    System.out.println(levelOrderBottomDFS(root1)); //[[15,7],[9,20],[3]]

  }

  public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int size = queue.size();

      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();

        list.add(node.val);

        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }

      result.add(0, list);
    }

    return result;
  }

  public static List<List<Integer>> levelOrderBottomDFS(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(root, 0, result);
    return result;
  }

  private static void dfs(TreeNode node, int idx, List<List<Integer>> result) {
    if (node == null) {
      return;
    }

    if (result.size() <= idx) {
      result.add(0, new ArrayList<>());
    }

    result.get(result.size() - idx - 1).add(node.val);

    if (node.left != null) dfs(node.left, idx+1, result);
    if (node.right != null) dfs (node.right, idx+1, result);
  }

}
