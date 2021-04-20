package chap02;

import java.util.Scanner;

//�� �迭�� �������� �Ǵ�
public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if(a.length !=  b.length) {
			return false;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
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
		
		System.out.print("�迭 b�� ��ڼ� : ");
		num =stdIn.nextInt(); //��ڼ�
		
		int[] b = new int[num];		//��ڼ��� num�� �迭
		
		for(int i=0; i<num; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = stdIn.nextInt();
		}
		
		
		System.out.println("�迭 a�� b�� "+ (equals(a,b) ? "�����ϴ�" : "�����ʽ��ϴ�."));

	}

}
