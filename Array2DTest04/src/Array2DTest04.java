
public class Array2DTest04 {

	public static void main(String[] args) {
		int[][] a = new int[][]{
			{1, 2, 3},
			{4, 5, 6, 7},
			{8, 9, 10, 11, 12}
		};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
	}

}
