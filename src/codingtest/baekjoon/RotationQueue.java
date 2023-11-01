package codingtest.baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class RotationQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 큐의 크기
        int m = sc.nextInt(); // 뽑아내려는 수의 개수

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            int index = sc.nextInt(); // 뽑아내려는 수의 위치
            int left = 0;
            int right = 0;

            while (deque.peek() != index) {
                deque.addLast(deque.removeFirst());
                left++;
            }

            right = deque.size() - left;

            count += Math.min(left, right);
            deque.removeFirst();
        }

        System.out.println(count);
        sc.close();
    }
}

