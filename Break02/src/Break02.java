import java.util.Scanner;

public class Break02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		
		while(true) {
		//for(;;) {
			System.out.print("������ �Է��ϼ���. (���� = 0) : ");
			num = sc.nextInt();
			sum += num;
			
			if(num == 0) {
				break;
			}
		}
		System.out.println("������ "+ sum + " �Դϴ�.");
		sc.close();
	}

}
