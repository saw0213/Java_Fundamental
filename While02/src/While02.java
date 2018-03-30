
public class While02 {

	public static void main(String[] args) {
		int num = 0, sum = 0;//, cycle = 0;
		
		
		
/******************** 합이 100 이 되기 직전 수, 합 출력 ********************/
		
		while(sum+num < 100) {
			sum += num;
			System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
			num++;
			//cycle++;
		}
	}
}