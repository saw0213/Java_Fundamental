
public class ExhancedForTest {
	
	public static void main(String[] args) {
		int[] arr = new int[] {10, 20, 30, 40, 50};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
