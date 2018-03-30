
public class For2D {

	public static void main(String[] args) {
		int i, j;
		
		//1번 for문 활용
		System.out.println("for문");
		for(i=2; i<10; i++) {
			for(j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
		//2번 while문 활용
		i = 2; j = 1;
		System.out.println("while문");
		while(i<10) {
			j = 1;
			while(j<10) {
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}
			i++; 
			System.out.println();
		}
		
		//3번 do while문 활용
		i = 2; j = 1;
		System.out.println("do while문");
		do {
			j = 1;
			do {
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			} while(j<10);
			i++; 
			System.out.println();
		} while(i<10);
	}

}
