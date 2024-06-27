package day9;

public class FruitMain {
	static void fruitBox(Fruit f) { // Fruit f = banana
		System.out.println(f.name + "을 포장했습니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana banana = new Banana("바나나", "노란색", 1500);
		Fruit b = banana;
		Orange orange = new Orange("오렌지", "오렌지색", 1000);
		Fruit o = orange;
		Apple apple = new Apple("사과", "빨간색", 5000);
		Fruit a = apple;
		Candy candy = new Candy();
		fruitBox(banana);
		fruitBox(apple);
		
	}
}
