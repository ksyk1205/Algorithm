package chap01;

import java.util.Scanner;

//n���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���.
public class StarPira {
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 						// ����(�ٺ�ȯ)
		}
	}
	public static void main(String []arg) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�Ƕ�̵��� ���̸� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		spira(n);
	}
}
