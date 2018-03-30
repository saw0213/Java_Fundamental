import java.util.Scanner;

public class Array2DTest07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է��ϼ��� : ");
		int stdNum = sc.nextInt();
		System.out.print("������ ���� �Է��ϼ��� : ");		
		int sbjNum = sc.nextInt();
		
		//�迭 �� ����
		String[] title = new String[sbjNum+4];
		title[0] = "NUM"; title[sbjNum+1] = "SUM"; title[sbjNum+2] = "AVG";title[sbjNum+3] = "RANK";
		for(int i=1; i<=sbjNum; i++) {
			title[i] = "SUB"+i;
		}
		
		int[][] a = new int [stdNum][sbjNum+4]; // [�л���][�����+4] �й� + ����� + ���� + ��� + ���
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(j == 0) {		//�й�
					a[i][j] = i+1;
				}else if(j == 1) {
					for(int k=1; k<=sbjNum; k++) {
						System.out.print("�л�"+(i+1)+"�� ����"+k+" : "); //���� �Է�
						a[i][k] = sc.nextInt();
					}
					
					for(int k=1; k<=sbjNum; k++) {		//����
						a[i][sbjNum+1] += a[i][k];
					}
					
					a[i][sbjNum+2] = a[i][sbjNum+1]/sbjNum;		//���
					break;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {		//���
			a[i][sbjNum+3] = 1;
			for(int j=0; j<a.length; j++) {
				if(a[i][sbjNum+1] < a[j][sbjNum+1]) {
					a[i][sbjNum+3]++;
				}
			}
		}
		
		for(int i=0; i<title.length; i++) {
			System.out.printf("%8s",title[i]);
		}
		System.out.println();
		for(int i=0; i<a.length; i++) {		//���
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%8d",a[i][j]);
			}
			System.out.println();
		}
		sc.close();

	}

}
