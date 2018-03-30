import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteTest01 {
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		int[] num = new int[6];
		int count = 0;	// 맞은 숫자의 수
		
		for(int i=0; i<lotto.length; i++) {		//생성
			lotto[i] = r.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {	//중복 확인
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length-1; i++) {	//버블 정렬
			boolean checked = false;
			for(int j=0; j<lotto.length-1-i; j++) {
				int temp;
				if(lotto[j]>lotto[j+1]) {
					temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					checked = true;
				}
			}
			if(!checked) break;
		}
		
		for(int i=0; i<lotto.length; i++) {		//정수 입력
			System.out.print("정수 입력(1~45) : ");
			num[i] = sc.nextInt();
			
			for(int j=0; j<i; j++) {	//중복 확인
				if(num[i]==num[j]) {
					System.out.println("중복된 숫자가 있습니다."+num[i]);
					i--;
					break;
				}
			}
			if(num[i]<1 || num[i]>45) {
				System.out.println("잘못된 입력입니다."+num[i]);
				i--;
			}
		}
		
		for(int i=0; i<lotto.length; i++) {		//비교
			for(int j=0; j<lotto.length; j++) {
				if(num[i]==lotto[j]) {
					count++;
					System.out.println(count+"개의 숫자가 일치합니다!! "+num[i]);
				}
			}
		}
		System.out.println("맞은 갯수 : "+count);		//출력
		System.out.println(Arrays.toString(lotto));
		sc.close();
	}
}
