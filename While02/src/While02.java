
public class While02 {

	public static void main(String[] args) {
		int num = 0, sum = 0;//, cycle = 0;
		
		
		
/******************** ���� 100 �� �Ǳ� ���� ��, �� ��� ********************/
		
		while(sum+num < 100) {
			sum += num;
			System.out.println("1���� " + num + "������ ���� " + sum + "�Դϴ�.");
			num++;
			//cycle++;
		}
	}
}