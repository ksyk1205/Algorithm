package codingtest.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {

  public static void main(String[] args) {
    int[][] maps = {
        {1, 0, 1, 1, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 1, 1},
        {1, 1, 1, 0, 1},
        {0, 0, 0, 0, 1}
    };
    System.out.println(solution(maps)); // 11

    int[][] maps2 = {
        {1, 0, 1, 1, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 1, 1},
        {1, 1, 1, 0, 0},
        {0, 0, 0, 0, 1}
    };
    System.out.println(solution(maps2)); // -1
  }

  public static int solution(int[][] maps) {
    int n = maps.length;
    int m = maps[0].length;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{0, 0});

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int x = current[0];
      int y = current[1];

      if (x == n - 1 && y == m - 1) {
        return maps[x][y];
      }

      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1) {
          maps[nx][ny] = maps[x][y] + 1;
          queue.add(new int[]{nx, ny});
        }
      }
    }

    return -1;

  }

}
