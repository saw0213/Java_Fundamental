
class Card{
	//�ν��Ͻ� ����, ������ �ʵ�(Non static field)
	String kind;
	int number;
	
	//Ŭ���� ����, ���� �ʵ�(Static field)
	static int width = 100;
	static int height = 250;
	
	//default ������
	Card() {
		
	}
	
	//������ �����ε�
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
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
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
