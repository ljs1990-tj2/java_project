package day1;

public class Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// name : 홍길동, age : 30, height : 170.1
		// addr : 인천, eventFlg : true
		String name = "홍길동"; // 문자
		int age = 30; // 정수
		double height = 170.1; // 실수
		String addr = "인천"; // 문자
		String addrNum = "30";  // 문자
		boolean eventFlag = true; // 참, 거짓
		// 자바에서 문자열(String)의 덧셈은 가능
		// 다만, 수학적 연산 x, 텍스트 이어붙이기
		System.out.println("이름 : " + name);
		System.out.println(name + "님의 나이는 " + age + "살 입니다.");
		
		System.out.print("나이 : ");
		System.out.println(age);
	}

}
