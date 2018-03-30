
import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********삼각형 만들기 프로그램2**********");
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println();
		System.out.println("for문 이용");
		
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
		System.out.println("while문 이용");
		
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
		System.out.println("do while문 이용");
		
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
