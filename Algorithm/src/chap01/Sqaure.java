package chap01;

import java.util.Scanner;

//오른쪽과 같이 입력한 수를 한 변으로 하는 정사각형을 * 기호로 풀력하는 프로그램을 작성하세요
public class Sqaure {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("한 변의 수를 입력하세요.");
		int n = stdIn.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
