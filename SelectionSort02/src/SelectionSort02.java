import java.util.Arrays;

public class SelectionSort02 {
	
	public static void main(String[] args) {
		int[] a = {50, 70, 10, 40, 30};
		
		System.out.println("선택정렬 전 : "+Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {
			boolean checked = false;
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					checked = true;
				}
			}
			if(!checked) break;
			System.out.println("  "+(i+1)+" 회전 후 : "+Arrays.toString(a));
		}
		System.out.println("선택정렬 후 : "+Arrays.toString(a));
	}

}
