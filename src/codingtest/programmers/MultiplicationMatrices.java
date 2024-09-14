package codingtest.programmers;

public class MultiplicationMatrices {
  public static void main(String[] args) {
    int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
    int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
    int[][] result = solution(arr1, arr2);
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.println(result[i][j]);
      }
    }
  }

  private static int[][] solution(int[][] arr1, int[][] arr2) {
    int rowsA = arr1.length;
    int colsA = arr1[0].length;
    int colsB = arr2[0].length;

    int[][] result = new int[rowsA][colsB];

    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < colsB; j++) {
        for (int k = 0; k < colsA; k++) {
          result[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }

    return result;
  }

}
