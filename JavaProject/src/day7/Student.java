package day7;

public class Student extends Person{
	
	String stuNo ; // 학번
	String stuDept ; // 학과
	
	Student(){
		System.out.println("Student 기본 생성자!");
	}
	Student(String name, int age){
		super(name, age);
		System.out.println("Student 매개변수 있는 생성자");
	}
	
	Student(String name, int age, String stuNo, String stuDept){
		super(name, age);
		this.stuNo = stuNo;
		this.stuDept = stuDept;
	}
	
	void study() {
		System.out.println("공부한다.");
	}
}
