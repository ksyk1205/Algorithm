package chap01;

import java.util.Scanner;

//1,2, .... , n 의 합을 구합니다.
//여기서 n이 7이면  '1+2+3+4+5+6+7 = 28'로 출력하는 프로그램을 작성하세요.
public class SumForTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n  = stdIn.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i<n) {
				System.out.print( i +"+");
			}else {
				System.out.print(i);
			}
			sum += i;
			
		}
		System.out.print("="+sum);
	}

}
