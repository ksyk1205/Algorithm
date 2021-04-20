package chap02;

//1000이하의 소수를 열거(버전 1)
public class PrimeNumber1 {
	
	public static void main(String[] args) {
		int cnt = 0; //나눗셈의 횟수
		for(int i=2; i<=1000; i++) {
			int n;
			for(n=2; n < i; n++) {
				cnt++;
				if(i%n ==0) { //나누어떨어지면 소수가 아님
					break;
				}
			}
			if( i == n) {//마지막까지 나누어덜어지지않음.
				System.out.println(n);
			}
		}
		
		System.out.println("나눗셈을 수행한 횟수 : "+cnt);
	}

}
