package day6;

public class Student {
	int stuNo; // 학번 
	String stuName; // 이름
	String stuDept; // 학과
	int age; // 나이
	String gender; // 성별
	
	Student(int stuNo, String stuName){
//		this(stuNo, stuName, "");
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	Student(int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	int getAge() {
		return age;
	}
}
