package day9;

public class Dog extends Animal{
	String breed;
	Dog(){
		super("정보없음", 0);
	}
	Dog(String name, int age, String breed){
		super(name, age);
		this.breed = breed;
	}
	
	void sound() {
		System.out.println("멍멍!");
	}
	
	String getBreed() {
		return this.breed;
	}
	
}
