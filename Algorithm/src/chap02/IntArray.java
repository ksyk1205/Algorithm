package chap02;

//��������� �ڷ����� int���� �迭(���� ��ڼ��� 5 : new�� ���� ��ü�� ����)
public class IntArray {
	public static void main(String []arg) {
		int[] a = new int[5]; //�迭�� ����
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1]*2;
		
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"] = " +a[i]);
		
	}
}
