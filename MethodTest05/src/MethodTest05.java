import java.util.Scanner;

public class MethodTest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String c = sc.next();
		System.out.print("���� �Է� : ");
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
