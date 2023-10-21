package codingtest.programmers;

public class AddMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int result = 45;
        for (int num : numbers) {
            result -=num;
        }
        return result;
    }
}
