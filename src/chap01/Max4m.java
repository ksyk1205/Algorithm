package chap01;

import java.util.Scanner;

//연습 문제 : 네 값의 최댓값을 구하는 max 4 메서드를 작성하세요.
public class Max4m {
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if( b >  max )
			max = b;
		if( c >  max )
			max = c;
		if( d >  max )
			max = d;
		
		
		return max;		
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
		
		System.out.println(" 네 개의 정수 중 최댓값은 ?");
		int max = max4(a, b, c, d);
		System.out.println(max);
		
	}

}
