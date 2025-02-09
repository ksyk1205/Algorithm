package codingtest.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 *  https://leetcode.com/problems/simplify-path/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class SimplifyPath {

  public static void main(String[] args) {
    System.out.println(simplifyPath("/home/"));
    System.out.println(simplifyPath("/home//foo/"));
    System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
    System.out.println(simplifyPath("/../"));
    System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
  }

  public static String simplifyPath(String path) {
    Deque<String> stack = new LinkedList<>();

    String[] split = path.split("/");
    for (String str : split) {
      if (str.equals("..")) {
        if (!stack.isEmpty()) {
          stack.pop();
        }
      } else if (!str.isEmpty() && !str.equals(".")) {
        stack.push(str);
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append("/"+stack.removeLast());
    }

    return sb.toString().length() == 0 ? "/" : sb.toString();
  }

}
