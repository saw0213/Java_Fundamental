import java.util.Scanner;

public class MethodTest03 {
	
	public static double power(double x, int n){
		double result = 1;
		for(int i=0; i<n; i++) {
			result *= x;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ� : ");
		double num = sc.nextDouble();
		System.out.print("���� : ");
		int pow = sc.nextInt();
		
		System.out.println("��� : "+power(num, pow));
		
		sc.close();
	}
	
}
