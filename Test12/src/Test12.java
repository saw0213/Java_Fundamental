import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor,eng,mat,sum;
		double avg;
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = (sum/3f);
		
		System.out.println("������ " + sum + "�� �Դϴ�.");
		System.out.println("����� " + avg + "�� �Դϴ�.");
		
		String score;
		
		//1�� ���
//		if(sum >= 270) {
//			score = "A";
//		}
//		else if(sum >= 240) {
//			score = "B";
//		}
//		else if(sum >= 210) {
//			score = "C";
//		}
//		else if(sum >= 180) {
//			score = "D";
//		}
//		else {
//			score = "F";
//		}
//		System.out.println(score + "���� �Դϴ�.");
		
		//2�� ���		
		switch(sum/30) {
		case 10 : case 9 : 
			score = "A";
			break;
		case 8 :
			score = "B";
			break;
		case 7 :
			score = "C";
			break;
		case 6 :
			score = "D";
			break;
		default :
			score = "F";
			break;		
		}
		System.out.println(score + "���� �Դϴ�.");
		sc.close();
	}
}
