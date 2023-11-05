package codingtest.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class GuitarStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] packagePrices = new int[M];
        int[] singlePrices = new int[M];

        for (int i = 0; i < M; i++) {
            packagePrices[i] = scanner.nextInt(); // 패키지 가격
            singlePrices[i] = scanner.nextInt(); // 낱개 가격
        }

        int minPackagePrice = Arrays.stream(packagePrices).min().getAsInt();
        int minSinglePrice = Arrays.stream(singlePrices).min().getAsInt();


        int result = 0;

        if (minPackagePrice <= minSinglePrice * 6) {
            // 패키지로만 구입하는 것이 이득일 경우
            result += (N / 6) * minPackagePrice;
            if (N % 6 * minSinglePrice > minPackagePrice) {
                result += minPackagePrice;
            } else {
                result += N % 6 * minSinglePrice;
            }
        } else {
            // 낱개로만 구입하는 것이 이득일 경우
            result += N * minSinglePrice;
        }

        System.out.println(result);
        scanner.close();

    }
}
