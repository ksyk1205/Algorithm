package chap01;

import java.util.Scanner;

//���� ����  : �� ���� �ּڰ��� ���ϴ� min4 �޼��带 �ۼ��ϼ���.
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
		
		System.out.println(" �� ���� ���� ���� �Է��Ͻÿ� ");
		System.out.print(" a = ");
		int a = stdIn.nextInt();
		System.out.print(" b = ");
		int b = stdIn.nextInt();
		System.out.print(" c = ");
		int c = stdIn.nextInt();
		System.out.print(" d = ");
		int d = stdIn.nextInt();
		
		System.out.println(" �� ���� ���� �� �ּڰ��� ?");
		int max = min4(a, b, c, d);
		System.out.println(max);

	}

}
