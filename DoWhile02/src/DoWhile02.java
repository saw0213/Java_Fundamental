import java.util.Scanner;

public class DoWhile02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("********�޴�����********");
			System.out.println("1 : ���� ����");
			System.out.println("2 : ���� ����");
			System.out.println("3 : ���� ����");
			System.out.println("4 : ���� �ݱ�");
			System.out.print("�޴��� �����ϼ���(1~4) : ");
			menu = sc.nextInt();
			
			if(menu<1 || menu>4) {
				System.out.println("�߸��� �Է��Դϴ�!!");
			}
			
		}while(!(menu>=1 && menu<=4));
		
		//System.out.println(menu + "�� �޴��� ���� �Ǿ����ϴ�.");
		
		switch(menu) {
		case 1:
			System.out.println("������ ���� �ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("���Ͽ� ���⸦ �ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("������ ���� �ϼ̽��ϴ�.");
			break;
		case 4:
			System.out.println("������ �ݽ��ϴ�.");
			break;
		}
		sc.close();
	}
}
