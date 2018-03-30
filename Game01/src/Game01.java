import java.util.Scanner;

public class Game01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"가위", "바위", "보"};
		String retry; // 재시도 묻기
		
		int[] score = new int[3]; // 무 승 패 순으로 저장
		
		System.out.println("**********가위 바위 보 게임 입니다.**********");
		do {
			int user;
			while(true) {
				System.out.print("0 - 가위 / 1 - 바위 / 2 - 보 : ");
				user = sc.nextInt();
				if(0<=user && 2>=user) {
					break;
				}
				System.out.println("잘못된 입력입니다.");
			}
			int com = (int)(Math.random()*3);
			System.out.println("User는 " +s[user]+"이고, Computer는 "+s[com]+"입니다.");
			
			switch((user-com+3)%3) {
			case 1:
				System.out.println("User가 승리 하였습니다.");
				score[1]++;
				break;
			case 2:
				System.out.println("User가 패배 하였습니다.");
				score[2]++;
				break;
			case 0:
				System.out.println("비겼습니다.");
				score[0]++;
				break;
			}
			
			while(true) {
				System.out.print("한번 더 하시겠습니까? (Y/N) : ");
				retry = sc.next();
				if(retry.equalsIgnoreCase("n")||retry.equalsIgnoreCase("y")) {
					break;
				}
				System.out.println("잘못된 입력입니다.");
			}
		}while(retry.equalsIgnoreCase("y"));
			
		System.out.println(score[1]+"승 "+score[0]+"무 "+score[1]+"패 입니다.");
		sc.close();
	}
}
