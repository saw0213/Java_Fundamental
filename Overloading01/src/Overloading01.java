import java.util.Scanner;

public class Overloading01 {

	public static int max(int a, int b) {
		if(a > b) return a;
		else return b;
	}
	
	public static int max(int a, int b, int c) {
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(max(a,b)+".."+max(a,b,c));
		sc.close();

	}

}
