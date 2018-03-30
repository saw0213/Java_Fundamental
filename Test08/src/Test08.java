
public class Test08 {

	public static void main(String[] args) {
		int a = 37, b = 25;
		
		System.out.println("a & b = " + (a&b));
		System.out.println("a | b = " + (a|b));
		System.out.println("a ^ b = " + (a^b));
		System.out.println();
		
		int c = 53, d = 36;
		
		System.out.println("c & d = " + (c&d));
		System.out.println("c | d = " + (c|d));
		System.out.println("c ^ d = " + (c^d));
		System.out.println();
		
		int a1 = 4, b1 = 64;
		
		System.out.println("a1 << 4 = " + (a1<<4));
		System.out.println("b1 >> 3 = " + (b1>>3));
		System.out.println();
		
		int a2 = 30, b2 = 10, c2;
		
		c2 = (a2<b2 ? a2 : b2);
		System.out.println(c2);
		
		if(a2 < b2) {
			c2 = a2;
		}
		else {
			c2 = b2;
		}
		System.out.println(c2);
	}

}
