package codingtest.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

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
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(9);

    printTree(invertTree(root)); // 4 7 2 9 6 3 1
    System.out.println("\n---------------------------");
    printTree(invertTreeDFS(root)); // 4 7 2 9 6 3 1
  }

  public static void printTree(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      System.out.print(node.val + " ");

      if (node.left != null) queue.add(node.left);
      if (node.right != null) queue.add(node.right);
    }
  }


  public static TreeNode invertTree(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (! queue.isEmpty()) {
      TreeNode node = queue.poll();

      TreeNode temp = node.left;
      node.left = node.right;
      node.right = temp;

      if (node.left != null) queue.add(node.left);
      if (node.right != null) queue.add(node.right);
    }

    return root;
  }

  public static TreeNode invertTreeDFS(TreeNode root) {
     if (root == null) {
       return null;
     }

     TreeNode temp = root.left;
     root.left = invertTreeDFS(root.right);
     root.right = invertTreeDFS(temp);

     return root;
  }

}
