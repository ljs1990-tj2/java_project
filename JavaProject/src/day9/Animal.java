package day9;

public class Animal {
	String name;
	int age;
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	void info(){
		// 이름 : 동물, 나이: 5
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}
	void sound() {
		// 동물이 소리를 냅니다.
		System.out.println(this.name + "이(가) 소리를 냅니다.");
	}
	
	
	
	
	
}
