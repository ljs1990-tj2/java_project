package day8;

public class Car {
	String name ; // 차 종류
	String color ; 
	int speed;
	
	// 1. 단순히 실행하고 끝내는 메소드
	void setName() {
		System.out.println("이름을 넣는 메소드");
	}
	// 2. 내가 원하는 값을 되돌려 주는 메소드
	String getName() {
		return name; 
	}
	
	void speedUp(int s) {
		speed = speed + s;
		// speed += s;
	}
	// speedDown 메소드 정의
	// speed가 음수가 될 경우 0으로 변경
	void speedDown(int s) {
		speed -= s;
		if(speed < 0) {
			speed = 0;
		}
	}
	
}
