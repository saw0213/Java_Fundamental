import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[5];
		
		
//		for(int i=0; i<arr1.length; i++) {
//			System.out.printf("%5d", arr2[i]);
//		}
//		System.out.println();
//		
//		for(int i=0; i<arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		
//		for(int i=0; i<arr2.length; i++) {
//			System.out.printf("%5d", arr2[i]);
//		}
//		System.out.println();		
		
		System.out.println(Arrays.toString(arr2));		
		System.arraycopy(arr1, 2, arr2, 2, 3);
		System.out.println(Arrays.toString(arr2));
	}
}
