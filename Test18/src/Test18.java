import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
//		int i = 1;
//		while(i<=10) {
//			System.out.print(i+" ");
//			i++;
//		}
		
		while (num > 0) {
			System.out.print(num%10);
			num /= 10;
		}
		sc.close();
	}

}
