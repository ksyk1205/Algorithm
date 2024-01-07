package codingtest.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataAnalysis {
    public static void main(String[] args) {

        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int[][] result = solution(data, ext, val_ext, sort_by);

        // 결과 출력
        for (int[] item : result) {
            System.out.println(java.util.Arrays.toString(item));
        }

    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> result = new ArrayList<>();

        for (int[] item : data) {
            int extValue;
            switch (ext) {
                case "code":
                    extValue = item[0];
                    break;
                case "date":
                    extValue = item[1];
                    break;
                case "maximum":
                    extValue = item[2];
                    break;
                case "remain":
                    extValue = item[3];
                    break;
                default:
                    throw new IllegalArgumentException("Invalid ext value");
            }

            if (extValue < val_ext) {
                result.add(item);
            }
        }

        Comparator<int[]> comparator;
        switch (sort_by) {
            case "code":
                comparator = Comparator.comparingInt(arr -> arr[0]);
                break;
            case "date":
                comparator = Comparator.comparingInt(arr -> arr[1]);
                break;
            case "maximum" :
                comparator = Comparator.comparingInt(arr -> arr[2]);
                break;
            case "remain" :
                comparator = Comparator.comparingInt(arr -> arr[3]);
                break;
            default:
                throw new IllegalArgumentException("Invalid sort_by value");
        }

        result.sort(comparator);

        return result.toArray(new int[0][]);

//  풀이 방법 2.
//        String[] arr = {"code","date","maximum","remain"};
//        List<String> columnList = Arrays.asList(arr);
//        int extIdx = columnList.indexOf(ext);
//        int sortIdx = columnList.indexOf(sort_by);
//        int[][] answer = Arrays.stream(data).filter(o1 -> o1[extIdx] < val_ext)
//                .sorted((o1 ,o2) -> o1[sortIdx]-o2[sortIdx]).toArray(int[][]::new);
//
//        return answer;
    }
}
