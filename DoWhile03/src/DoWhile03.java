import java.util.Scanner;

public class DoWhile03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String quest;
		int month;
		
		do {
			System.out.println("******* 계절 표시 프로그램 ********");
			
			do {
				System.out.print("월 입력 (1~12) : ");
				month = sc.nextInt();
				
				if(month < 1 || month > 12) {
					System.out.println(month + "은(는) 잘못된 입력입니다.");
				}
			} while(month < 1 || month > 12);
			
			switch(month/3) {
			case 1:
				System.out.println(month + " 월은 봄입니다.");
				break;
			case 2:
				System.out.println(month + " 월은 여름입니다.");
				break;
			case 3:
				System.out.println(month + " 월은 가을입니다.");
				break;
			case 4: case 0:
				System.out.println(month + " 월은 겨울입니다.");
				break;
//			default :
//				System.out.println(month + "은(는) 잘못된 입력입니다.");
			}
			
			do {
				System.out.print("한번 더 하시겠습니까? (Y/N) : ");
				quest = sc.next();
				
				if(!(quest.equalsIgnoreCase("y") || quest.equalsIgnoreCase("n"))) {
					System.out.println(quest + "은(는) 잘못된 입력입니다.");
				}
			} while(!(quest.equalsIgnoreCase("y") || quest.equalsIgnoreCase("n")));

		} while(quest.equalsIgnoreCase("y"));
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}	
	
}
