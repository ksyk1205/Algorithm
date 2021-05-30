package chap01;

import java.util.Scanner;

//n단의 피라미드를 출력하는 메서드를 작성하세요.
public class StarPira {
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}
	}
	public static void main(String []arg) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("피라미드의 길이를 입력하세요.");
		int n = stdIn.nextInt();
		
		spira(n);
	}
}
