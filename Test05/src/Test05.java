//import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		int kor, eng, mat, sum;
		double avg;
		
		kor = 90;
		eng = 90;
		mat = 92;
		
		sum = kor + eng + mat;
		avg = (double)sum / 3;
		
		System.out.println("성적의 합 = " + sum);
		System.out.println("성적의 평균 = " + avg);
		System.out.printf("%.2f\n",avg);
		
		float f = 1.6f;
		int i = (int)f;
		
		System.out.printf("%d",i);
		
	//	byte b = 10;
		
	//	int i2 = 300;
	//	byte b2 = (byte)i2;		
		

	}

}