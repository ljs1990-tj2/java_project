package day7;

public class Person {
	private String name;
	private int age;
	
	Person(){
		System.out.println("Person 기본 생성자!");
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("Person 매개변수 있는 생성자");
	}
	
	void speak() {
		System.out.println("말한다");
	}
	void eat() {
		System.out.println("먹는다");
	}
	void walk() {
		System.out.println("걷는다");
	}
	
}
