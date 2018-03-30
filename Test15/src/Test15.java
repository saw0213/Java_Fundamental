
import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴선택(1~3) : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("파일 읽기");
			break;
		case 2:
			System.out.println("파일 저장");
			break;
		case 3:
		case 4:
			System.out.println("파일 닫기");
			break;
		default:
			System.out.println("파일 읽기 실패");
			break;
		}
		sc.close();
	}
	
}
