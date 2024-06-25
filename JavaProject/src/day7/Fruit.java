package day7;

public class Fruit {
	String name;
	String color;
	int price;
	
	Fruit(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	void getPrice() {
		System.out.println(name + "의 가격은 " + price + " 입니다.");
	}
}
