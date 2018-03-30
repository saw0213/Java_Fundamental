import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("========1========");
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
/****************************************************************/
		System.out.println("========2========");
		
		for(int i=0; i<num; i++) {
			for(int j=i; j<num-1; j++ ) {
				System.out.print("  ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
/****************************************************************/	
		System.out.println("========3========");
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j<i) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
/****************************************************************/		
		System.out.println("========4========");
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j+i<num-1) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}

			}
			System.out.println();
		}
		
	sc.close();
	}

}

