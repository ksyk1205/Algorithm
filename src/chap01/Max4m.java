package chap01;

import java.util.Scanner;

//���� ���� : �� ���� �ִ��� ���ϴ� max 4 �޼��带 �ۼ��ϼ���.
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
		
		System.out.println(" �� ���� ���� ���� �Է��Ͻÿ� ");
		System.out.print(" a = ");
		int a = stdIn.nextInt();
		System.out.print(" b = ");
		int b = stdIn.nextInt();
		System.out.print(" c = ");
		int c = stdIn.nextInt();
		System.out.print(" d = ");
		int d = stdIn.nextInt();
		
		System.out.println(" �� ���� ���� �� �ִ��� ?");
		int max = max4(a, b, c, d);
		System.out.println(max);
		
	}

}
