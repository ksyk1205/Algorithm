package chap01;

import java.util.Scanner;

//1부터 10까지의 합은 (1+10)*5 와 같이 가우스의 덧셈을 이용하여
//1,2, .... , n 의 합을 구합니다.

public class SumGauss {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n  = stdIn.nextInt();
	
		int sum = (1+n)*(n/2)+(n % 2 == 1 ? (n + 1) / 2 : 0); // 합
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
	}
}
