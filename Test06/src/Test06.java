import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			num = sc.nextInt();
			
			if(num % 2 == 0){
				System.out.println(num + "��(��) 2�� ����Դϴ�.\n");
			}
			else if(num <= 0) {
				System.out.println("�����մϴ�.\n");
				break;
			}
			else {
				System.out.println(num + "��(��) 2�� ����� �ƴմϴ�.\n");
			}
		}
		sc.close();
		
	}

}
