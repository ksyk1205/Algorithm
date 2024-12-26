package codingtest.programmers;

public class Network {
  public static void main(String[] args) {
    int n1 = 3;
    int[][] computers1 = {
        {1, 1, 0},
        {1, 1, 0},
        {0, 0, 1}
    };
    System.out.println(solution(n1, computers1));

    int n2 = 3;
    int[][] computers2 = {
        {1, 1, 0},
        {1, 1, 1},
        {0, 1, 1}
    };
    System.out.println(solution(n2, computers2));
  }

  public static int solution(int n, int[][] computers) {
    boolean[] visited = new boolean[n];
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        dfs(i, computers, visited);
        cnt++;
      }
    }

    return cnt;
  }

  private static void dfs(int node, int[][] computers, boolean[] visited) {
    visited[node] = true;

    for (int i = 0; i < computers.length; i++) {
      if (computers[node][i] == 1 && !visited[i]) {
        dfs(i, computers, visited);
      }
    }
  }
}
