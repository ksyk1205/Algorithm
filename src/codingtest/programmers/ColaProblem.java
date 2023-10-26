package codingtest.programmers;

public class ColaProblem {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;

        System.out.println(solution(a,b,n));
    }
    public static int solution(int a, int b, int n) {
        int totalCola = 0;
        int emptyCola = 0;

        while (n >= a) {
            totalCola += n / a * b;
            emptyCola = n % a + n / a * b;
            n = emptyCola;
        }

        return totalCola;
    }
}
