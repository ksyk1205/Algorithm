package chap01;

import java.util.Scanner;

//두 변수 a,b에 정수를 입려하고 b-a를 출력하는 프로그램을 작성
public class Difference {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 값을 입력하세요.");
		int a = stdIn.nextInt();
		int b;
		while(true) {
			
			System.out.print("b의 값을 입력하세요.");
			b = stdIn.nextInt();
			
			if(b > a)
				break;
			
			System.out.println("a보다 큰 값을 입력하세요.");
		}
		System.out.println("b - a는 " + (b - a) + "입니다.");
	}

}
