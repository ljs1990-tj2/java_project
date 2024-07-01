package day10;

public class FruitMain {
	static void test(int a) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple1 = new Apple("사과", "빨간색" ,1000);
		Apple apple2 = new Apple("사과", "빨간색" ,1000);
		
		Banana banana = new Banana("바나나", "바나나" ,1500);
		
		System.out.println(apple1 == apple2);
		apple1.price = 2000;
		
		Object obj[] = new Object[3];
		obj[0] = "홍길동"; // String 
		obj[1] = banana;
		int a = 10;
		obj[2] = 10; 
		
		String number = "123";
		int number2 = Integer.parseInt(number);
		int number3 = number2 + 50;
		System.out.println(number3);
		
		String str = "홍길동";
		String str2 = "홍길동 ";
		String str3 = new String("홍길동");
		str3 = "안녕";
		System.out.println(str == str2);
		System.out.println(str.equals(str3));
		
		int qawerq = 10;
		
	
		
	}
}
