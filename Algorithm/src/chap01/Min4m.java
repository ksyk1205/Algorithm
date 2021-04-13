package chap01;

import java.util.Scanner;

//연습 문제  : 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
public class Min4m {
	static int min4(int a, int b, int c, int d) {
		int min =a;
		
		if( b <  min )
			min = b;
		if( c <  min )
			min = c;
		if( d <  min )
			min = d;
		
		return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println(" 네 개의 정수 값을 입력하시오 ");
		System.out.print(" a = ");
		int a = stdIn.nextInt();
		System.out.print(" b = ");
		int b = stdIn.nextInt();
		System.out.print(" c = ");
		int c = stdIn.nextInt();
		System.out.print(" d = ");
		int d = stdIn.nextInt();
		
		System.out.println(" 네 개의 정수 중 최솟값은 ?");
		int max = min4(a, b, c, d);
		System.out.println(max);

	}

}
