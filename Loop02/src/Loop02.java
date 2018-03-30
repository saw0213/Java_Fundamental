
import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("**********삼각형 만들기 프로그램***********");
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt();
		
		System.out.println();
		System.out.println("for문 이용");
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
				}
			System.out.println();
		}
/****************************************************************/		
		System.out.println();
		System.out.println("while문 이용");
		
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
		System.out.println("do while문 이용");
		
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
