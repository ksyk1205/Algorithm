package chap02;

import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드를 작성하세요.
public class Rcopy {
	static void rcopy(int[] a,int[] b) {
		for(int i=0; i<a.length; i++) {
			b[i] = a[a.length-i-1];
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int num =stdIn.nextInt(); //요솟수
		
		int[] a = new int[num];		//요솟수가 num인 배열
		
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
