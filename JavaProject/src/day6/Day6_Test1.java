package day6;

import java.util.Arrays;

public class Day6_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 20);
//		hong.phone = "123-123";
		hong.setPhone("123-123");
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getPhone());
		
		int a = MultipleCalc.multiple(2, 3);
		int b = MultipleCalc.multiple(2, 3, 4);
	}

}
