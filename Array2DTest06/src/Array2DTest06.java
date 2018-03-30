import java.util.Scanner;

public class Array2DTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String retry = null;
		int[][] a = new int[4][5];
		
		do {
			System.out.print("����� �� �Է� (1~45) : ");
			int count = 0, luckyNum = sc.nextInt();
			
			for(int i=0; i<a.length; i++) {		//����, ��, �迭 ���
				for(int j=0; j<a[i].length; j++) {
					a[i][j] = (int)(Math.random()*45)+1;
					if(a[i][j] == luckyNum) {
						count++;
					}
					System.out.printf("%5d",a[i][j]);
				}
				System.out.println();
			}
	
			System.out.println(count+"�� ��ġ");			
			switch(count) {		//��� ���
			case 0:
				System.out.println("���� �׷� ���Դϴ�.");
				break;
			case 1:
				System.out.println("������ ���Դϴ�.");
				break;
			case 2:
				System.out.println("���� ���� ���Դϴ�.");
				break;
			case 3:
				System.out.println("��� ������ ���Դϴ�.");
				break;
			case 4:
				System.out.println("����� ���Դϴ�.");
				break;
			default:
				System.out.println("���� ����� ���Դϴ�.");
				break;
			}
				
			while(true) {		//�ݺ� ����
				System.out.print("�ѹ� �� �Ͻðڽ��ϱ�? (Y/N) : ");
				retry = sc.next();
				if(retry.equalsIgnoreCase("n")||retry.equalsIgnoreCase("y")) {						
					break;
				}
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		}while(retry.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
