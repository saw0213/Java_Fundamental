import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();			//������ ����
    	int K = sc.nextInt();			//������ ����
    	
    	int[][] jewel = new int[N][2];	//����
    	int[] bag = new int[K];			//����
    	
    	for(int i=0; i<jewel.length; i++) {
    		jewel[i][0] = sc.nextInt();	//���� ����
    		jewel[i][1] = sc.nextInt();	//���� ����
    	}
    	
    	for(int i=0; i<bag.length; i++) {
    		bag[i] = sc.nextInt();		//�� ���� �ִ빫��
    	}
    	
    	sc.close();
	}

}