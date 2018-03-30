import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor,eng,mat,sum;
		double avg;
		
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = (sum/3f);
		
		System.out.println("총점은 " + sum + "점 입니다.");
		System.out.println("평균은 " + avg + "점 입니다.");
		
		String score;
		
		//1번 방법
//		if(sum >= 270) {
//			score = "A";
//		}
//		else if(sum >= 240) {
//			score = "B";
//		}
//		else if(sum >= 210) {
//			score = "C";
//		}
//		else if(sum >= 180) {
//			score = "D";
//		}
//		else {
//			score = "F";
//		}
//		System.out.println(score + "학점 입니다.");
		
		//2번 방법		
		switch(sum/30) {
		case 10 : case 9 : 
			score = "A";
			break;
		case 8 :
			score = "B";
			break;
		case 7 :
			score = "C";
			break;
		case 6 :
			score = "D";
			break;
		default :
			score = "F";
			break;		
		}
		System.out.println(score + "학점 입니다.");
		sc.close();
	}
}
