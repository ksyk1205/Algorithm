package chap01;

import java.util.Scanner;

//���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��ϼ���
public class DigitsNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("n�� �Է��ϼ���.");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int cnt = 0;
		while(n>0){
			n/=10;
			cnt++;
		}
		System.out.println("�� ���� "+cnt+"�ڸ� �Դϴ�.");

	}

}
