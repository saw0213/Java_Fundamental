import java.util.Scanner;

public class Game01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"����", "����", "��"};
		String retry; // ��õ� ����
		
		int[] score = new int[3]; // �� �� �� ������ ����
		
		System.out.println("**********���� ���� �� ���� �Դϴ�.**********");
		do {
			int user;
			while(true) {
				System.out.print("0 - ���� / 1 - ���� / 2 - �� : ");
				user = sc.nextInt();
				if(0<=user && 2>=user) {
					break;
				}
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			int com = (int)(Math.random()*3);
			System.out.println("User�� " +s[user]+"�̰�, Computer�� "+s[com]+"�Դϴ�.");
			
			switch((user-com+3)%3) {
			case 1:
				System.out.println("User�� �¸� �Ͽ����ϴ�.");
				score[1]++;
				break;
			case 2:
				System.out.println("User�� �й� �Ͽ����ϴ�.");
				score[2]++;
				break;
			case 0:
				System.out.println("�����ϴ�.");
				score[0]++;
				break;
			}
			
			while(true) {
				System.out.print("�ѹ� �� �Ͻðڽ��ϱ�? (Y/N) : ");
				retry = sc.next();
				if(retry.equalsIgnoreCase("n")||retry.equalsIgnoreCase("y")) {
					break;
				}
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}while(retry.equalsIgnoreCase("y"));
			
		System.out.println(score[1]+"�� "+score[0]+"�� "+score[1]+"�� �Դϴ�.");
		sc.close();
	}
}
