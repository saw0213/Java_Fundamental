import java.util.Scanner;

public class Array2DTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String retry = null;
		int[][] a = new int[4][5];
		
		do {
			System.out.print("행운의 수 입력 (1~45) : ");
			int count = 0, luckyNum = sc.nextInt();
			
			for(int i=0; i<a.length; i++) {		//생성, 비교, 배열 출력
				for(int j=0; j<a[i].length; j++) {
					a[i][j] = (int)(Math.random()*45)+1;
					if(a[i][j] == luckyNum) {
						count++;
					}
					System.out.printf("%5d",a[i][j]);
				}
				System.out.println();
			}
	
			System.out.println(count+"개 일치");			
			switch(count) {		//결과 출력
			case 0:
				System.out.println("그저 그런 날입니다.");
				break;
			case 1:
				System.out.println("괜찮은 날입니다.");
				break;
			case 2:
				System.out.println("운이 좋은 날입니다.");
				break;
			case 3:
				System.out.println("운수 대통인 날입니다.");
				break;
			case 4:
				System.out.println("대박인 날입니다.");
				break;
			default:
				System.out.println("정말 대박인 날입니다.");
				break;
			}
				
			while(true) {		//반복 묻기
				System.out.print("한번 더 하시겠습니까? (Y/N) : ");
				retry = sc.next();
				if(retry.equalsIgnoreCase("n")||retry.equalsIgnoreCase("y")) {						
					break;
				}
				System.out.println("잘못된 입력입니다.");
			}
			
		}while(retry.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
