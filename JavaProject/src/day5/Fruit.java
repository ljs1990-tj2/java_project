package day5;

public class Fruit {
	String name;
	private int price;
	
	void setPrice(int price) {
		
	}
	
	Fruit(){
		System.out.println("과일정보없음");
	}
	Fruit(String name){
		this.name = name;
	}
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	int getPrice(int num) {
		return price * num;
	}
}