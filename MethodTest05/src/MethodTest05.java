import java.util.Scanner;

public class MethodTest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String c = sc.next();
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		count(c, n);
		sc.close();
	}
	
	public static void count(String c, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<n-i; j++) {
				System.out.print(" "+c);
			}
			System.out.println();
		}
	}

}
