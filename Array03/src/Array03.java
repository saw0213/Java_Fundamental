import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********학생 성적 처리 프로그램**********");
		System.out.print("학생수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int[] stu = new int[num];
		
		for(int i=0; i<stu.length; i++) {
			System.out.print((i+1)+"번째 학생의 점수를 입력하세요 : ");
			stu[i] = sc.nextInt();
			sum += stu[i];
			//System.out.println((i+1)+"번째 학생의 점수는 "+stu[i]+"점 입니다.");
		}
		
		System.out.println(stu.length+"명의 총점은 "+sum+"점 입니다.");
		System.out.println("평균은 "+(double)sum/stu.length+"점 입니다.");
		
		sc.close();
	}
	
}
