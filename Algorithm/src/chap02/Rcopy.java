package chap02;

import java.util.Scanner;

//�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��带 �ۼ��ϼ���.
public class Rcopy {
	static void rcopy(int[] a,int[] b) {
		for(int i=0; i<a.length; i++) {
			b[i] = a[a.length-i-1];
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��ڼ� : ");
		int num =stdIn.nextInt(); //��ڼ�
		
		int[] a = new int[num];		//��ڼ��� num�� �迭
		
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = stdIn.nextInt();
		}
		int[] b = new int[num];
		
		rcopy(a,b);
		
		for(int i=0; i<b.length; i++)
			System.out.println("b["+i+"] = "+b[i]);
	}

}
