package chap02;

import java.util.Scanner;

//�迭 a�� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ��ϼ���
public class SumOf {
	static int sumOf(int[] a) {
		int sum =0 ;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num =stdIn.nextInt(); //��ڼ�
		
		int[] x = new int[num];		//��ڼ��� num�� �迭
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		int sum = sumOf(x);
		
		System.out.println("�迭�� ���� "+sum+"�Դϴ�.");

	}

}
