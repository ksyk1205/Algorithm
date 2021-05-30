package chap03;

import java.util.Scanner;

//�����˻�(���ʹ�)
public class SeqSearchSen {

	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		
		a[n] = key; //���ʸ� �߰�
		
		while(true) {
			if(a[i]==key) {
				break; //�˻�����!
			}
			i++;
		}
		return i == n ? -1 : i; 
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1]; //��ڼ� num +1
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("�˻��� �� :");
		int key = stdIn.nextInt();
		
		int idx = seqSearch(x, num, key); //���� x����  Ű ���� key�� ��Ҹ� �˻�
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}else {
			System.out.println(key+"��(��)"+"x["+idx+"]�� �ֽ��ϴ�.");
		}		
	
	
	}
}
