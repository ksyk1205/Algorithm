package chap01;

import java.util.Scanner;

//직각이등변 삼각형을 출력하는 부분을 메서드로 작성하세요
public class Triangle {
	static void triangleLB(int n) { //왼쪽 아래가 직각인 이등변 삼각형을 출력
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleLU(int n) { //왼쪽 위가 직각인 이등변 삼각형을 출력
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n) { //오른쪽 위가 직각인 이등변 삼각형을 출력
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
	static void triangleRB(int n) { //오른쪽 아래가 직각인 이등변 삼각형을 출력
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
		
		System.out.print("변의 길이를 입력하세요.");
		int n = stdIn.nextInt();
		
		triangleRB(n);
	}

}
