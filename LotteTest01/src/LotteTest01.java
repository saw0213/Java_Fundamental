import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteTest01 {
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[] num = new int[6];
		int count = 0;	// ���� ������ ��
		
		for(int i=0; i<lotto.length; i++) {		//����
			lotto[i] = r.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {	//�ߺ� Ȯ��
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length-1; i++) {	//���� ����
			boolean checked = false;
			for(int j=0; j<lotto.length-1-i; j++) {
				int temp;
				if(lotto[j]>lotto[j+1]) {
					temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					checked = true;
				}
			}
			if(!checked) break;
		}
		
		for(int i=0; i<lotto.length; i++) {		//���� �Է�
			System.out.print("���� �Է�(1~45) : ");
			num[i] = sc.nextInt();
			
			for(int j=0; j<i; j++) {	//�ߺ� Ȯ��
				if(num[i]==num[j]) {
					System.out.println("�ߺ��� ���ڰ� �ֽ��ϴ�."+num[i]);
					i--;
					break;
				}
			}
			if(num[i]<1 || num[i]>45) {
				System.out.println("�߸��� �Է��Դϴ�."+num[i]);
				i--;
			}
		}
		
		for(int i=0; i<lotto.length; i++) {		//��
			for(int j=0; j<lotto.length; j++) {
				if(num[i]==lotto[j]) {
					count++;
					System.out.println(count+"���� ���ڰ� ��ġ�մϴ�!! "+num[i]);
				}
			}
		}
		System.out.println("���� ���� : "+count);		//���
		System.out.println(Arrays.toString(lotto));
		sc.close();
	}
}
