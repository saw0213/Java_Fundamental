
import java.util.Scanner;

public class Array01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("������ �Է��ϼ��� 1 : ");
		int s1 = sc.nextInt();
		sum += s1;
		System.out.println("1�� �л��� ������ "+s1+"�� �Դϴ�.");
		
		System.out.print("������ �Է��ϼ��� 2 : ");
		int s2 = sc.nextInt();
		sum += s2;
		System.out.println("2�� �л��� ������ "+s2+"�� �Դϴ�.");
		
		System.out.print("������ �Է��ϼ��� 3 : ");
		int s3 = sc.nextInt();
		sum += s3;
		System.out.println("3�� �л��� ������ "+s3+"�� �Դϴ�.");
		
		System.out.print("������ �Է��ϼ��� 4 : ");
		int s4 = sc.nextInt();
		sum += s4;
		System.out.println("4�� �л��� ������ "+s4+"�� �Դϴ�.");
		
		System.out.print("������ �Է��ϼ��� 5 : ");
		int s5 = sc.nextInt();
		sum += s5;
		System.out.println("5�� �л��� ������ "+s5+"�� �Դϴ�.");
		
		System.out.println("������ "+sum+" �� �Դϴ�.");
		System.out.println("����� "+(double)sum/5+" �� �Դϴ�.");
		sc.close();
	}

}
