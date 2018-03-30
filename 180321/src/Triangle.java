import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Put the length of bottom (Must be an odd number) : ");
			num = sc.nextInt();
			
			if(num%2 != 1) {
				System.out.println("Please Retry!! " + num + " is not an odd number");
			}
			
		} while(num%2 != 1);
		
		for(int i = 0; i < num/2 + 1; i++) {
			
			for(int j = 0; j < num/2 - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i*2 + 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
				
		}
		
		System.out.println("Done!!");
		sc.close();
	}

}