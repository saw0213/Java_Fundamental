
class Tv{
	//멤버 변수
	String color;
	boolean power;
	int channel;
	
	//멤버 메소드
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}

public class TvTest {

	public static void main(String[] args) {
		//tv1 인스턴스
		Tv tv1 = new Tv();
		
		tv1.color = "Red";
		tv1.power();
		tv1.channel = 9;
		tv1.channelUp();
		tv1.channelUp();
		
		System.out.println("tv1의 색상 : " + tv1.color);
		System.out.println("tv1의 전원 : " + (tv1.power==true ? "On" : "Off"));
		System.out.println("tv1의 채널 : " + tv1.channel);
		
		System.out.println();
		//tv2 인스턴스
		Tv tv2 = new Tv();
		
		tv2.color = "Black";
		tv2.power();
		tv2.channel = 15;
		tv2.channelUp();
		
		System.out.println("tv2의 색상 : " + tv2.color);
		System.out.println("tv2의 전원 : " + (tv2.power==true ? "On" : "Off"));
		System.out.println("tv2의 채널 : " + tv2.channel);
		System.out.println();
		
		//참조변수의 변경
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t2 = t1; 	//t1이 참조하는 곳을 t2도 참조하게 하겠다
		t1.channel = 7;
		
		System.out.println("t1의 채널 : " + t1.channel);
		System.out.println("t2의 채널 : "+ t2.channel);
	}

}
