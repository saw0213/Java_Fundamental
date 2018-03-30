
class Car{
	int serialNo;
	String color;
	String gearType;
	int door;
	
	static int count = 0;
	//�ν��Ͻ� �ʱ���
	{
		serialNo = ++count;
	}
	
	Car() {
		this("white","auto",4);
	}
	
	Car(String color) {
		this(color, "auto", 4);

	}
	
	//�Ű������� �޴� ������
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//���������
	Car(Car c){
	//	this(c.color, c.gearType, c.door);
		/*this.*/color = c.color;
		/*this.*/gearType = c.gearType;
		/*this.*/door = c.door;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("c1�� serialNo = "+c1.serialNo+", color = " +c1.color + ", gearType = "+c1.gearType+", door = "+c1.door);
		
		Car c2 = new Car("black", "stick", 2);
		System.out.println("c2�� serialNo = "+c2.serialNo+", color = " +c2.color + ", gearType = "+c2.gearType+", door = "+c2.door);
		
		Car c3 = new Car("blue");
		System.out.println("c3�� serialNo = "+c3.serialNo+", color = "+c3.color+", gearType = "+c3.gearType+", door = "+c3.door);
		
		Car c4 = new Car(c3);
		System.out.println("c4�� serialNo = "+c4.serialNo+", color = "+c4.color+", gearType = "+c4.gearType+", door = "+c4.door);
	}
}
