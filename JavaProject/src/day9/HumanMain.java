package day9;

import java.util.Arrays;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30);
		// name : 홍길동, age : 30, static paper : 100
		Human kim = new Human("김철수", 20);
		// name : 김철수, age : 20, static paper : 100
		Human yu = new Human("유재석", 40);
		// name : 유재석, age : 40, static paper : 100
		
		hong.age = 31;
		System.out.println(hong.age);
		hong.paper -= 10;
		System.out.println(kim.paper);
		Human.paper += 50;
		System.out.println(yu.paper);
		
	}
}
