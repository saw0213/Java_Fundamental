import java.util.Scanner;

public class Test17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
		
		// 1번		
//		for(int i=1; i<=num; i++) {
//			if(i%2 == 1) {
//				System.out.print("*");
//			}else {
//				System.out.print("+");
//			}
//		}
		
		// 2번
//		int sum = 0;
//		for(int i=1; i<=num; i++) {
//			sum += i;
//			if(i < num) {
//				System.out.print(i +" + ");
//			}else {
//				System.out.print(i +" = "+ sum);
//			}
//		}
		int i = 1;
		while(i <= 10) {
			System.out.print(i+" ");
			i++;
		}
		sc.close();
	}
}
