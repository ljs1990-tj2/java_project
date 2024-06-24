package day6;

public class Ref2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student(1234, "홍길동");
		// hong => 6537cf78
		hong.setInfo(20, null);
		Array_Ex1.studentEx1(hong); // 6537cf78
		
//		hong.age = hong.age+1;
		System.out.println(hong.age); // 6537cf78
		
	}
}
