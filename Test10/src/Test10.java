import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0 �Դϴ�.");
		}
		else if(num % 2 != 1) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		}
		else if(num % 2 != 0) {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		sc.close();
	}
}
