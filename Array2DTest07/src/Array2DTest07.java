import java.util.Scanner;

public class Array2DTest07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수를 입력하세요 : ");
		int stdNum = sc.nextInt();
		System.out.print("과목의 수를 입력하세요 : ");		
		int sbjNum = sc.nextInt();
		
		//배열 위 제목
		String[] title = new String[sbjNum+4];
		title[0] = "NUM"; title[sbjNum+1] = "SUM"; title[sbjNum+2] = "AVG";title[sbjNum+3] = "RANK";
		for(int i=1; i<=sbjNum; i++) {
			title[i] = "SUB"+i;
		}
		
		int[][] a = new int [stdNum][sbjNum+4]; // [학생수][과목수+4] 학번 + 과목수 + 총점 + 평균 + 등수
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(j == 0) {		//학번
					a[i][j] = i+1;
				}else if(j == 1) {
					for(int k=1; k<=sbjNum; k++) {
						System.out.print("학생"+(i+1)+"의 점수"+k+" : "); //성적 입력
						a[i][k] = sc.nextInt();
					}
					
					for(int k=1; k<=sbjNum; k++) {		//총점
						a[i][sbjNum+1] += a[i][k];
					}
					
					a[i][sbjNum+2] = a[i][sbjNum+1]/sbjNum;		//평균
					break;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {		//등수
			a[i][sbjNum+3] = 1;
			for(int j=0; j<a.length; j++) {
				if(a[i][sbjNum+1] < a[j][sbjNum+1]) {
					a[i][sbjNum+3]++;
				}
			}
		}
		
		for(int i=0; i<title.length; i++) {
			System.out.printf("%8s",title[i]);
		}
		System.out.println();
		for(int i=0; i<a.length; i++) {		//출력
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%8d",a[i][j]);
			}
			System.out.println();
		}
		sc.close();

	}

}
