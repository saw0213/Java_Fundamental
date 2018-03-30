import java.util.Random;
import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[] a = new int[10];
		
//		for(int i=0; i<a.length; i++) {
//			System.out.print((i+1)+"번째 수 입력 : ");
//			a[i] = sc.nextInt();
//		}
		
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(50);
			System.out.print(+a[i]+", ");
		}
		System.out.println("]");
		
		int max = a[0], min = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
			if(min > a[i]) {
				min = a[i];
			}
		
		}
		System.out.println("최댓값 = "+max);
		System.out.println("최솟값 = "+min);
		sc.close();
	}

	
}
