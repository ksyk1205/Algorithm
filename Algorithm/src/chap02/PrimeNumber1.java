package chap02;

//1000������ �Ҽ��� ����(���� 1)
public class PrimeNumber1 {
	
	public static void main(String[] args) {
		int cnt = 0; //�������� Ƚ��
		for(int i=2; i<=1000; i++) {
			int n;
			for(n=2; n < i; n++) {
				cnt++;
				if(i%n ==0) { //����������� �Ҽ��� �ƴ�
					break;
				}
			}
			if( i == n) {//���������� �����������������.
				System.out.println(n);
			}
		}
		
		System.out.println("�������� ������ Ƚ�� : "+cnt);
	}

}
