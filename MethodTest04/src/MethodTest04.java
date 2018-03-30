import java.util.Scanner;

public class MethodTest04 {
	
	public static void drawStar(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------- Method로 나누어 별표 찍기 ---------");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		drawStar(n);
		
		sc.close();
	}
}
