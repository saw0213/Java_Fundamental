import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,temp;
		
		System.out.print("정수 입력 A : ");
		a = sc.nextInt();
		System.out.print("정수 입력 B : ");
		b = sc.nextInt();
		
		if(b < a) {
			temp = b;
			b = a;
			a = temp;
		}		
		System.out.println("A = "+ a + "\nB = " + b);	
		sc.close();
		
	}
}
