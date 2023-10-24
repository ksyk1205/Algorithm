package codingtest.programmers;

public class Trio {
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};

        System.out.println(solution(number));
    }

    public static int solution(int[] number) {
        int cnt = 0;
        for (int i=0; i<number.length-2; i++) {
            for (int j=i+1; j<number.length-1; j++) {
                for (int l=j+1; l<number.length; l++) {
                    if (number[i]+ number[j] + number[l] == 0){
                        cnt ++;
                    }
                }
            }
        }
        return cnt;
    }
}
