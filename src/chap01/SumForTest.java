package chap01;

import java.util.Scanner;

//1,2, .... , n �� ���� ���մϴ�.
//���⼭ n�� 7�̸�  '1+2+3+4+5+6+7 = 28'�� ����ϴ� ���α׷��� �ۼ��ϼ���.
public class SumForTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n  = stdIn.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i<n) {
				System.out.print( i +"+");
			}else {
				System.out.print(i);
			}
			sum += i;
			
		}
		System.out.print("="+sum);
	}

}
