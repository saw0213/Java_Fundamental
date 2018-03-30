import java.util.Arrays;
import java.util.Scanner;

public class MethodTest09 {
	
	public static int[] makeArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		return arr;
	}
	//나의 방법, 위치 카운트 (배열이용)
//	public static int[] linearSearch(int[] arr, int searchNum[]) {
//		int a = 2; 		//serachNum[a]에 위치 기록 [0] -> 찾을값 [1] -> 값의 갯수
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == searchNum[0]) {
//				searchNum[a] = i;
//				searchNum[1]++;
//				a++;
//			}
//		}
//		return searchNum;
//	}
	
	//2개 이상을 찾을때도 가능한 검색 메소드
	public static int linearSearch2(int[] x, int k) {
		int count = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i] == k) {
				count++;
				System.out.print((i+1)+" ");
			}
		}
		return count;
	}
	
//	public static void printResult(int[] arr) {
//		if(arr[1] == 0) {
//			System.out.println("찾으시는 숫자가 없습니다.");
//		}else {
//			System.out.print("찾으시는 숫자는 "+arr[1]+"개 존재하고");
//			for(int i=2; i<arr.length; i++) {
//				if(i>2 && arr[i]==0) {
//					break;
//				}else {
//					System.out.print(" "+(arr[i]+1));
//				}
//			}
//			System.out.println("번째에 위치합니다.");
//		}
//	}
	
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 갯수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		//int[] searchNum = new int[num+2]; 
		//[0] -> 검색할 값   [1] -> 카운트   [2 to num+2] -> 위치를 적기위해(최소0개 최대num개)
		
		System.out.print("검색할 값 입력 : ");
		//searchNum[0] = sc.nextInt();
		int searchNum = sc.nextInt();
		
		makeArr(arr);					//배열 생성
		//linearSearch(arr, searchNum);	//검색
		//printResult(searchNum);		//결과 출력
		int count = linearSearch2(arr, searchNum);

		if(count == 0) {
			System.out.println("찾으시는 숫자가 없습니다.");
		}else {
			System.out.println("번째에 찾으시는 숫자가 "+count+"개 있습니다.");
		}
		
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
