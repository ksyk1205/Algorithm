package chap01;
//연습문제 : 세 값의 최솟값을 구하는 min3메서드를 작성하세요.
public class Min3m {
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if( b <  min )
			min = b;
		if( c <  min )
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min3(3,2,1) = " + min3(3,2,1));
		System.out.println("min3(3,2,2) = " + min3(3,2,2));
		System.out.println("min3(3,1,2) = " + min3(3,1,2));
		System.out.println("min3(3,2,3) = " + min3(3,2,3));
		System.out.println("min3(2,1,3) = " + min3(2,1,3));
		System.out.println("min3(3,3,2) = " + min3(3,3,2));
		System.out.println("min3(3,3,3) = " + min3(3,3,3));
		System.out.println("min3(2,2,3) = " + min3(2,2,3));
		System.out.println("min3(2,3,1) = " + min3(2,3,1));
		System.out.println("min3(2,3,2) = " + min3(2,3,2));
		System.out.println("min3(1,3,2) = " + min3(1,3,2));
		System.out.println("min3(2,3,3) = " + min3(2,3,3));
		System.out.println("min3(1,2,3) = " + min3(1,2,3));
	}

}
