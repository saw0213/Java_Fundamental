import java.util.Arrays;
import java.util.Scanner;

public class MethodTest10 {
	
	public static int[] makeArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	public static int[] reverse(int arr[]) {
		for(int i=0; i<arr.length/2; i++) {
			swap(arr, i, arr.length-1-i);
		}
		return arr;
	}
	
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********** 배열의 값을 거꾸로 넣는 프로그램 **********");
		System.out.print("배열의 갯수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		makeArr(arr);
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
