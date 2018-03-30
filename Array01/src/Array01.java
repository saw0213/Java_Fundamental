
import java.util.Scanner;

public class Array01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("성적을 입력하세요 1 : ");
		int s1 = sc.nextInt();
		sum += s1;
		System.out.println("1번 학생의 점수는 "+s1+"점 입니다.");
		
		System.out.print("성적을 입력하세요 2 : ");
		int s2 = sc.nextInt();
		sum += s2;
		System.out.println("2번 학생의 점수는 "+s2+"점 입니다.");
		
		System.out.print("성적을 입력하세요 3 : ");
		int s3 = sc.nextInt();
		sum += s3;
		System.out.println("3번 학생의 점수는 "+s3+"점 입니다.");
		
		System.out.print("성적을 입력하세요 4 : ");
		int s4 = sc.nextInt();
		sum += s4;
		System.out.println("4번 학생의 점수는 "+s4+"점 입니다.");
		
		System.out.print("성적을 입력하세요 5 : ");
		int s5 = sc.nextInt();
		sum += s5;
		System.out.println("5번 학생의 점수는 "+s5+"점 입니다.");
		
		System.out.println("총점은 "+sum+" 점 입니다.");
		System.out.println("평균은 "+(double)sum/5+" 점 입니다.");
		sc.close();
	}

}
