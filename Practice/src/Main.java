import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();			//보석의 갯수
    	int K = sc.nextInt();			//가방의 갯수
    	
    	int[][] jewel = new int[N][2];	//보석
    	int[] bag = new int[K];			//가방
    	
    	for(int i=0; i<jewel.length; i++) {
    		jewel[i][0] = sc.nextInt();	//보석 무게
    		jewel[i][1] = sc.nextInt();	//보석 가격
    	}
    	
    	for(int i=0; i<bag.length; i++) {
    		bag[i] = sc.nextInt();		//각 가방 최대무게
    	}
    	
    	sc.close();
	}

}