package day7;

import java.util.ArrayList;

public class FruitMain {
	static void fruitBox(Fruit f, int num) {
		System.out.println(f.name + "를 " + num + "개 포장했습니다.");
		if(f instanceof Banana) {
			System.out.println("바나나 전용 박스에 담았습니다.");
		}
		if(f instanceof Orange) {
			System.out.println("오렌지 전용 박스에 담았습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana banana = new Banana("바나나", "노란색", 1500);
		Orange orange = new Orange("오렌지", "오렌지색", 1000);
		Apple apple = new Apple("사과", "빨간색", 5000);
		
		fruitBox(banana, 3);
		fruitBox(orange, 3);
		fruitBox(apple, 3);
		
	}
}
