import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if(num > 0) {
			System.out.println(num + "은(는) 양수입니다.");
		}
		else if(num < 0){
			System.out.println(num + "은(는) 음수입니다.");
		}
		else {
			System.out.println("0 입니다.");
		}
		sc.close();
	}

}
