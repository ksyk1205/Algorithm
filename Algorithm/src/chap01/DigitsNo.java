package chap01;

import java.util.Scanner;

//양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요
public class DigitsNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("n을 입력하세요.");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int cnt = 0;
		while(n>0){
			n/=10;
			cnt++;
		}
		System.out.println("그 수는 "+cnt+"자리 입니다.");

	}

}
