import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 : ");
		int a = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int b = sc.nextInt();
		System.out.print("정수 입력 3 : ");
		int c = sc.nextInt();
		
		int max = a, min = a;
		
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		System.out.println("Max : "+ max + "\nMin : " + min);
		sc.close();	

	}

}