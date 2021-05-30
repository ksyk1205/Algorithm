package chap01;

import java.util.Scanner;

//�����̵ �ﰢ���� ����ϴ� �κ��� �޼���� �ۼ��ϼ���
public class Triangle {
	static void triangleLB(int n) { //���� �Ʒ��� ������ �̵ �ﰢ���� ���
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleLU(int n) { //���� ���� ������ �̵ �ﰢ���� ���
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n) { //������ ���� ������ �̵ �ﰢ���� ���
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRB(int n) { //������ �Ʒ��� ������ �̵ �ﰢ���� ���
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� ���̸� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		triangleRB(n);
	}

}
