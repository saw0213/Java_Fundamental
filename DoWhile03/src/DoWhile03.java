import java.util.Scanner;

public class DoWhile03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String quest;
		int month;
		
		do {
			System.out.println("******* ���� ǥ�� ���α׷� ********");
			
			do {
				System.out.print("�� �Է� (1~12) : ");
				month = sc.nextInt();
				
				if(month < 1 || month > 12) {
					System.out.println(month + "��(��) �߸��� �Է��Դϴ�.");
				}
			} while(month < 1 || month > 12);
			
			switch(month/3) {
			case 1:
				System.out.println(month + " ���� ���Դϴ�.");
				break;
			case 2:
				System.out.println(month + " ���� �����Դϴ�.");
				break;
			case 3:
				System.out.println(month + " ���� �����Դϴ�.");
				break;
			case 4: case 0:
				System.out.println(month + " ���� �ܿ��Դϴ�.");
				break;
//			default :
//				System.out.println(month + "��(��) �߸��� �Է��Դϴ�.");
			}
			
			do {
				System.out.print("�ѹ� �� �Ͻðڽ��ϱ�? (Y/N) : ");
				quest = sc.next();
				
				if(!(quest.equalsIgnoreCase("y") || quest.equalsIgnoreCase("n"))) {
					System.out.println(quest + "��(��) �߸��� �Է��Դϴ�.");
				}
			} while(!(quest.equalsIgnoreCase("y") || quest.equalsIgnoreCase("n")));

		} while(quest.equalsIgnoreCase("y"));
		
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}	
	
}
