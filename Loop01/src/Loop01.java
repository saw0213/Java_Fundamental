import java.util.Scanner;

public class Loop01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********���簢�� ����� ���α׷�**********");
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		int i, j;
		
		System.out.println();
		System.out.println("for�� �̿�");
		
		for(i=0; i<num; i++) {
			for(j=0; j<num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
/****************************************************************/
		System.out.println();
		System.out.println("while�� �̿�");
		i = 0;
		j = 0;
		
		while(i<num) {
			j = 0;
			while(j<num) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
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
			} while(j<num);
			System.out.println();
			i++;	
		} while(i<num);
		
		sc.close();
	}

}
