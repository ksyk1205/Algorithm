package chap01;

import java.util.Scanner;

//���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ��ϼ���
public class SumAB {
	static int sumof(int a, int b) {
		int min = a<b ? a:b ;
		int max = a<b ? b:a ;
		
		int sum=0;
		for(int i =min ; i <= max ; i++) {
			sum += i;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
		System.out.print("a�� ����");
		int a = stdIn.nextInt();
		System.out.print("b�� ����");
		int b = stdIn.nextInt();

		System.out.println("���� a, b ������ ��� ������ ���� " + sumof(a, b) + "�Դϴ�.");

	}

}
