package chap01;

import java.util.Scanner;

//�����ʰ� ���� �Է��� ���� �� ������ �ϴ� ���簢���� * ��ȣ�� Ǯ���ϴ� ���α׷��� �ۼ��ϼ���
public class Sqaure {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� ���� ���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
