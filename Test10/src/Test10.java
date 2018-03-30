import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0 입니다.");
		}
		else if(num % 2 != 1) {
			System.out.println(num + "은(는) 짝수입니다.");
		}
		else if(num % 2 != 0) {
			System.out.println(num + "은(는) 홀수입니다.");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		sc.close();
	}
}
