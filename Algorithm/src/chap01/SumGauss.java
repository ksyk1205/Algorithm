package chap01;

import java.util.Scanner;

//1���� 10������ ���� (1+10)*5 �� ���� ���콺�� ������ �̿��Ͽ�
//1,2, .... , n �� ���� ���մϴ�.

public class SumGauss {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n  = stdIn.nextInt();
	
		int sum = (1+n)*(n/2)+(n % 2 == 1 ? (n + 1) / 2 : 0); // ��
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		
	}
}
