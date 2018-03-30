import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하시오 : ");
			num = sc.nextInt();
			
			if(num % 2 == 0){
				System.out.println(num + "은(는) 2의 배수입니다.\n");
			}
			else if(num <= 0) {
				System.out.println("종료합니다.\n");
				break;
			}
			else {
				System.out.println(num + "은(는) 2의 배수가 아닙니다.\n");
			}
		}
		sc.close();
		
	}

}
