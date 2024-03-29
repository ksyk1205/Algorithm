package chap03;

import java.util.Scanner;

public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				return i; //검색성공!
			}
		}
			
		return -1; //검색실패
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색할 값 :");
		int key = stdIn.nextInt();
		
		int idx = seqSearch(x, num, key); //베열 x에서  키 값이 key인 요소를 검색
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"은(는)"+"x["+idx+"]에 있습니다.");
		}

	}
}
