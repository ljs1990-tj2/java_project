package day10;

public class Apple extends Fruit{

	Apple(String name, String color, int price) {
		super(name, color, price);
	}
	
	@Override
	void print() {
		super.print();
		System.out.println("사과는 비싸다!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사과 클래스";
	}
}
