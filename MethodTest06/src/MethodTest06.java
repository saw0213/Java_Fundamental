import java.util.Scanner;

public class MethodTest06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		char c = sc.next().charAt(0);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		
	for(int i=0; i<n; i++) {	
		drawChars(' ', i);
		drawChars(c, n-i);
		System.out.println();
		}
	sc.close();
	}
	
	public static void drawChars(char c, int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(" "+c);
		}
	}
}
