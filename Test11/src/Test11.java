import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� (1~12) : ");
		int month = sc.nextInt();
		
		//1�� ��� (||)
		if(month == 3 || month == 4 || month == 5) {
			System.out.println(month + "���� ���Դϴ�.");
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.println(month + "���� �����Դϴ�.");
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.println(month + "���� �����Դϴ�.");
		}
		else if(month == 12 || month == 1 || month == 2){
			System.out.println(month + "���� �ܿ��Դϴ�.");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�.\n(1~12)������ ���ڸ� �Է��ϼ���.");
		}
		
		//2�� ��� (&&)
		if(month >= 3 && month <= 5) {
			System.out.println(month + "���� ���Դϴ�.");
		}
		else if(month >= 6 && month <= 8) {
			System.out.println(month + "���� �����Դϴ�.");
		}
		else if(month >= 9 && month <= 11) {
			System.out.println(month + "���� �����Դϴ�.");
		}
		else if(month == 12 || month >= 1 && month <= 2) {
			System.out.println(month + "���� �ܿ��Դϴ�.");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�.\n(1~12)������ ���ڸ� �Է��ϼ���.");
		}
		sc.close();
		
		//3�� ��� (switch)
		switch(month){
		case 3: case 4: case 5:
			System.out.println(month + "���� ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 12: case 1: case 2:
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.\n(1~12)������ ���ڸ� �Է��ϼ���.");
			break;
		}
	}

}
