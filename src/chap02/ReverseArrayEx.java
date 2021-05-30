package chap02;

import java.util.Scanner;

//�迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷��� �ۼ��ϼ���.
public class ReverseArrayEx {
	static void swap(int[] a, int idx1, int idx2) {
		//�迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		System.out.println("a["+idx1+1+"]��(��)"+"a["+ idx2+1+"]�� ��ȯ�մϴ�.");
	}
	static void reverse(int[] a) {
		//�迭 a�� ��Ҹ� �������� ����
		for(int i=0; i<a.length/2; i++) {
			swap(a,i,a.length-i-1);
			for(int j=0; j < a.length; j++) {
				System.out.print(a[j]);
			}
			System.out.println();
		}
		
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
		
		reverse(x);
		
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}

}
