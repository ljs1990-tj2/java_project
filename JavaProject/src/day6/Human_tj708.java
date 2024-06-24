package day6;

public class Human_tj708 {
	String name;
	int age;
	String addr;
	static int money708 ;
	
	static void staticName() {
//		name = "유재석";
		money708 = 130000;
	}
	
	Human_tj708(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
		money708 = 150000;
	}
	
	void eat(String txt, String food){
		System.out.println(txt + "을" + food + "를(을) 먹었다!");
	}
	void study(){
		System.out.println("자바 진짜 재밌다");
	}
	
}
