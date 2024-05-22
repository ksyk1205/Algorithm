package codingtest.programmers;

public class Fatigue {

  private static int maxDungeons = 0;

  public static void main(String[] args) {
    int k = 80;
    int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
    System.out.println(solution(k, dungeons));
  }

  public static int solution(int k, int[][] dungeons) {
    boolean[] visited = new boolean[dungeons.length];
    explore(k, dungeons, visited, 0);
    return maxDungeons;
  }

  private static void explore(int k, int[][] dungeons, boolean[] visited, int count) {
    if (count > maxDungeons) {
      maxDungeons = count;
    }

    for (int i = 0; i < dungeons.length; i++) {
      if (!visited[i] && k >= dungeons[i][0]) {
        visited[i] = true;
        explore(k - dungeons[i][1], dungeons, visited, count + 1);
        visited[i] = false;
      }
    }
  }

}
