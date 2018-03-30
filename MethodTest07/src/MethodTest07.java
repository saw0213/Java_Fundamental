
public class MethodTest07 {
	
	static int x = 700;		//전역변수 (Globle variable)
	static int y = 900;
	
	public static void printX() {
		System.out.println("3 x = " + x);
	}
	
	public static void main(String[] args) {
		System.out.println("1 x = " + x);
		
		int x = 800;		//지역변수 (Local variable)
		
		System.out.println("2 x = " + x);

		printX();
		
		System.out.println("4 x = " + x);
		
		System.out.println("5 x = " + MethodTest07.x);
		
		System.out.println("y = " + MethodTest07.y);
	}
}
