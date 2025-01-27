package codingtest.programmers;

public class IntegerTriangle {

  public static void main(String[] args) {
    int[][] triangle = {
        {7},
        {3, 8},
        {8, 1, 0},
        {2, 7, 4, 4},
        {4, 5, 2, 6, 5}
    };

    System.out.println(solution(triangle)); // 결과: 30
  }

  public static int solution(int[][] triangle) {
    int n = triangle.length;

    for (int i=n-2; i>=0; i--) {
      for (int j=0; j<triangle[i].length; j++) {
        triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
      }
    }

    return triangle[0][0];
  }
}
