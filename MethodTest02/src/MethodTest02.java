
import java.util.Scanner;

public class MethodTest02 {
	//�޼ҵ� ����(����)
	public static int max(int a, int b, int c) {
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		
		return max;	//�ݵ�� �ϳ� �Ǵ� 0��
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("--- "+(i+1)+"�� �л� ---");
			System.out.print("���� �Է� : ");
			height[i] = sc.nextInt();
			System.out.print("ü�� �Է� : ");
			weight[i] = sc.nextInt();
			System.out.print("���� �Է� : ");
			age[i] = sc.nextInt();
		}
		//�޼ҵ� ȣ��
		int maxHeight = max(height[0], height[1], height[2]);
		int maxWeight = max(weight[0], weight[1], weight[2]);
		int maxAge = max(age[0], age[1], age[2]);
		
		System.out.println("������ �ִ� : "+maxHeight);
		System.out.println("������ �ִ� : "+maxWeight);
		System.out.println("������ �ִ� : "+maxAge);
		sc.close();
	}

}