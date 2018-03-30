
public class SelectionSort01 {
	
	public static void main(String[] args) {
		int[] arr = {50, 70, 20, 10, 30};
		
		System.out.print("선택 정렬 전 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(" "+(1+i)+"번 회전 후 : ");
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		System.out.print("선택 정렬 후 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
