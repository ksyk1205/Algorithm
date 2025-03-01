package codingtest.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
 */

public class BinaryTreeZigzagLevelOrderTraversal {

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
    TreeNode node = new TreeNode(3);
    node.left = new TreeNode(9);
    node.right = new TreeNode(20);
    node.right.left = new TreeNode(15);
    node.right.right = new TreeNode(7);

    System.out.println(zigzagLevelOrder(node)); // [[3], [20, 9], [15, 7]]
    System.out.println(zigzagLevelOrderDFS(node)); // [[3], [20, 9], [15, 7]]

    TreeNode node2 = new TreeNode(1);
    node2.left = new TreeNode(2);
    node2.right = new TreeNode(3);
    node2.left.left = new TreeNode(4);
    node2.right.right = new TreeNode(5);

    System.out.println(zigzagLevelOrder(node2)); // [[1], [3, 2], [4, 5]]
    System.out.println(zigzagLevelOrderDFS(node2)); // [[1], [3, 2], [4, 5]]

  }

  public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    int level = 1;

    while (!queue.isEmpty()) {
      int size = queue.size();

      List<Integer> list = new ArrayList<>();
      for (int i=0; i<size; i++) {
        TreeNode node = queue.poll();

        if (level%2==0) {
          list.add(0, node.val);
        } else {
          list.add(node.val);
        }


        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }

      level++;
      result.add(list);
    }

    return result;
  }

  public static List<List<Integer>> zigzagLevelOrderDFS(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(root, result, 0);
    return result;
  }

  private static void dfs(TreeNode root, List<List<Integer>> list, int index) {
    if (root == null) return;

    if (list.size() <= index) {
      list.add(new ArrayList<>());
    }

    if (index % 2 == 0) {
      list.get(index).add(root.val);
    } else {
      list.get(index).add(0, root.val);
    }

    if (root.left != null) dfs(root.left ,list, index+1);
    if (root.right != null) dfs (root.right, list, index+1);
  }
}
