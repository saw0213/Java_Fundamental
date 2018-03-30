
class Card{
	//인스턴스 변수, 비정적 필드(Non static field)
	String kind;
	int number;
	
	//클래스 변수, 정적 필드(Static field)
	static int width = 100;
	static int height = 250;
	
	//default 생성자
	Card() {
		
	}
	
	//생성자 오버로딩
	Card(String k, int n) {
		kind = k;
		number = n;
	}
	
}

public class CardTest {
	
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.Height = " + Card.height);
		System.out.println();
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("Card.c1 = " + c1.kind + ", " + c1.number + ", Width : " + Card.width + " Height : " + Card.height);
		System.out.println("Card.c2 = " + c2.kind + ", " + c2.number + ", Width : " + Card.width + " Height : " + Card.height);
		System.out.println();
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("Card.c1 = " + c1.kind + ", " + c1.number + ", Width : " + Card.width + " Height : " + Card.height);
		System.out.println("Card.c2 = " + c2.kind + ", " + c2.number + ", Width : " + Card.width + " Height : " + Card.height);
		
		System.out.println();System.out.println();System.out.println();
		Card c3 = new Card("Diamond", 13);
		
		System.out.println("Card.c3 = " + c3.kind + ", " + c3.number + ", Width : " + Card.width + " Height : " + Card.height);
		System.out.println("Card.c3 = " + c3.kind + ", " + c3.number + ", Width : " + Card.width + " Height : " + Card.height);

	}

}
