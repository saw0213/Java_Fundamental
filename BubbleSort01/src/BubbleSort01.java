import java.util.Arrays;

public class BubbleSort01 {

	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30, 55, 66, 88, 22, 44};
		
		System.out.println("정렬 전 : "+Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {
			boolean checked = false;
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					checked = true;
				}
			}
			System.out.println((i+1)+" 회전 : "+Arrays.toString(a));
			if(!checked) {
				break;
			}
		}
		System.out.println("정렬 후 : "+Arrays.toString(a));
	}

}
