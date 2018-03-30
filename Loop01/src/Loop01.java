import java.util.Scanner;

public class Loop01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********정사각형 만들기 프로그램**********");
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int i, j;
		
		System.out.println();
		System.out.println("for문 이용");
		
		for(i=0; i<num; i++) {
			for(j=0; j<num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
/****************************************************************/
		System.out.println();
		System.out.println("while문 이용");
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
		System.out.println("do while문 이용");
		
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
