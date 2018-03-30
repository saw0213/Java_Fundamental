
public class Test04 {

	public static void main(String[] args) {
		final double PI;
		PI = 3.14;  //원주율
//		PI = 3.15;
		double r = 7.5;
		//float f = 3.14F;
		//long l = 10000000000L;
		
		int i = 100;
		int oct = 0100;
		int hex = 0x0100;
		
		System.out.println("i = "+i);
		System.out.println("oct = "+oct);
		System.out.println("hex = "+hex);
		
		//byte b = 127;
		//System.out.println(b);
		
		System.out.println("원의 둘레 = "+(2*PI*r));
		System.out.println("원의 면적 = "+(PI*r*r));
	}

}
