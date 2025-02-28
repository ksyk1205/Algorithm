package codingtest.leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */

public class BinaryTreeLevelOrderTraversal {
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

    System.out.println(levelOrder(root));
    System.out.println(levelOrderDFS(root));


  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    List<List<Integer>> result = new ArrayList<>();

    while(! queue.isEmpty()) {
      int size = queue.size();

      List<Integer> list = new ArrayList<>();
      for (int i =0; i<size; i++) {
        TreeNode node = queue.poll();
        list.add(node.val);

        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }

      result.add(list);
    }

    return result;
  }


  public static List<List<Integer>> levelOrderDFS(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(root, 0, result);
    return result;
  }

  private static void dfs(TreeNode root, int index, List<List<Integer>> result) {
    if (root == null) return;

    if (result.size() <= index) {
      result.add(new ArrayList<>());
    }

    result.get(index).add(root.val);

    if (root.left != null) dfs(root.left, index+1, result);
    if (root.right != null) dfs(root.right, index+1, result);
  }
}
