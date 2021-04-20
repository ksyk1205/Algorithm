package chap02;

import java.util.Scanner;

//배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.
public class ReverseArrayEx {
	static void swap(int[] a, int idx1, int idx2) {
		//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		System.out.println("a["+idx1+1+"]과(와)"+"a["+ idx2+1+"]를 교환합니다.");
	}
	static void reverse(int[] a) {
		//배열 a의 요소를 역순으로 정렬
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
		
		System.out.print("요솟수 : ");
		int num =stdIn.nextInt(); //요솟수
		
		int[] x = new int[num];		//요솟수가 num인 배열
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
