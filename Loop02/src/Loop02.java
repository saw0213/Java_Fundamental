
import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("**********�ﰢ�� ����� ���α׷�***********");
		System.out.print("���� �Է� : ");
		
		int num = sc.nextInt();
		
		System.out.println();
		System.out.println("for�� �̿�");
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
				}
			System.out.println();
		}
/****************************************************************/		
		System.out.println();
		System.out.println("while�� �̿�");
		
		int i = 0, j = 0;
		
		while(i<num) {
			j = 0;
			while(j<=i) {
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
		j = 0;
		
		do {
			j = 0;
			do {
				System.out.print("* ");
				j++;
			} while(j<=i);
			i++;
			System.out.println();
		} while(i<num);
		sc.close();
	}

}
