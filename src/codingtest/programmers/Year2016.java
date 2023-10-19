package codingtest.programmers;

public class Year2016 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a,b));
    }

    public static String solution(int a, int b) {
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                sum += 30;
            } else if (i == 2) {
                sum += 29;
            } else {
                sum += 31;
            }
        }

        return week[(sum + b + 4) % 7];

    }
}