
class Data1{
	int value = 30;
	Data1() {
		System.out.println("Data1 持失切");
	}
}

class Data2{
	int value;
	
	Data2(){
		System.out.println("Data2 持失切");		
	}
	
	Data2(int x){
		value = x;
		System.out.println(value);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		
		d1.value = 20;
		d2.value = 10;
		System.out.println(d1.value);
		System.out.println(d2.value);
		
	}
}
