
import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********�ﰢ�� ����� ���α׷�2**********");
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.println();
		System.out.println("for�� �̿�");
		
		for(int i=0; i<num; i++) {
			for(int j=i; j<num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0; i<num; i++) {
			for(int j=num; i<j; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
/****************************************************************/
		System.out.println();
		System.out.println("while�� �̿�");
		
		int i = 0, j;
		
		while(i<num) {
			j = i;
			while(j<num) {
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}
/****************************************************************/
		System.out.println();
		System.out.println("do while�� �̿�");
		
		i = 0;
		
		do {
			j = i;
			do {
				System.out.print("* ");
				j++;
			} while(j<num);
			i++;
			System.out.println();
		} while(i<num);
		
		sc.close();
	}
}
