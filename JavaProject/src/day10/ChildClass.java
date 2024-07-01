package day10;

public class ChildClass extends ParentClass{
	
	@Override
	void gugudan(int num) {
		// TODO Auto-generated method stub
		System.out.println("=== " + num + "단을 선택했습니다. ===");
		super.gugudan(num);
		System.out.println("=== 종료되었습니다. ===");
	}
	
	void objType(Object obj) {
		if(obj instanceof String) {
			System.out.println("문자열 입니다.");
		} else if(obj instanceof Integer) {
			System.out.println("정수 입니다.");
		} else {
			System.out.println("문자나 정수가 아닙니다.");
		}
	}
	
}
