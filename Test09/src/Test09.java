import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if(num > 0) {
			System.out.println(num + "��(��) ����Դϴ�.");
		}
		else if(num < 0){
			System.out.println(num + "��(��) �����Դϴ�.");
		}
		else {
			System.out.println("0 �Դϴ�.");
		}
		sc.close();
	}

}
