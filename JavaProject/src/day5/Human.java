package day5;

public class Human {
	String name;
	int age;
	String addr;
	
	Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("생성자다!");
	}
	
	void eat(String txt, String food){
		System.out.println(txt + "을" + food + "를(을) 먹었다!");
	}
	void study(){
		System.out.println("자바 진짜 재밌다");
	}
	
}
