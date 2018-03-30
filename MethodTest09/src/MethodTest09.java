import java.util.Arrays;
import java.util.Scanner;

public class MethodTest09 {
	
	public static int[] makeArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		return arr;
	}
	//���� ���, ��ġ ī��Ʈ (�迭�̿�)
//	public static int[] linearSearch(int[] arr, int searchNum[]) {
//		int a = 2; 		//serachNum[a]�� ��ġ ��� [0] -> ã���� [1] -> ���� ����
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == searchNum[0]) {
//				searchNum[a] = i;
//				searchNum[1]++;
//				a++;
//			}
//		}
//		return searchNum;
//	}
	
	//2�� �̻��� ã������ ������ �˻� �޼ҵ�
	public static int linearSearch2(int[] x, int k) {
		int count = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i] == k) {
				count++;
				System.out.print((i+1)+" ");
			}
		}
		return count;
	}
	
//	public static void printResult(int[] arr) {
//		if(arr[1] == 0) {
//			System.out.println("ã���ô� ���ڰ� �����ϴ�.");
//		}else {
//			System.out.print("ã���ô� ���ڴ� "+arr[1]+"�� �����ϰ�");
//			for(int i=2; i<arr.length; i++) {
//				if(i>2 && arr[i]==0) {
//					break;
//				}else {
//					System.out.print(" "+(arr[i]+1));
//				}
//			}
//			System.out.println("��°�� ��ġ�մϴ�.");
//		}
//	}
	
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ���� �Է� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		//int[] searchNum = new int[num+2]; 
		//[0] -> �˻��� ��   [1] -> ī��Ʈ   [2 to num+2] -> ��ġ�� ��������(�ּ�0�� �ִ�num��)
		
		System.out.print("�˻��� �� �Է� : ");
		//searchNum[0] = sc.nextInt();
		int searchNum = sc.nextInt();
		
		makeArr(arr);					//�迭 ����
		//linearSearch(arr, searchNum);	//�˻�
		//printResult(searchNum);		//��� ���
		int count = linearSearch2(arr, searchNum);

		if(count == 0) {
			System.out.println("ã���ô� ���ڰ� �����ϴ�.");
		}else {
			System.out.println("��°�� ã���ô� ���ڰ� "+count+"�� �ֽ��ϴ�.");
		}
		
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
