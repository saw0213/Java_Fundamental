
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 갯수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {	//생성
			arr[i] = (int)(Math.random()*1000);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++) {
			boolean checked = false;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					checked = true;
				}
			}
			if(!checked) {
				break;
			}
			System.out.println((i+1)+" 회전  : "+Arrays.toString(arr));
		}
		System.out.println("정렬 후 : "+Arrays.toString(arr));
		sc.close();
	}
}
