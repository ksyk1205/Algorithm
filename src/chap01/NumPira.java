package chap01;

import java.util.Scanner;

//n���� �����Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���.
public class NumPira {
	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print(i);
			System.out.println(); 						// ����(�ٺ�ȯ)
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�Ƕ�̵��� ���̸� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		npira(n);
	}

}
