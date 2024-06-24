package day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(1);
		System.out.print(true);
		System.out.print("test");
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int a = s.nextInt();
		System.out.print("두번째 숫자 : ");
		int b = s.nextInt();
		System.out.print("연산자 : ");
		String oper = s.next();
		switch (oper) {
			case "+": 
				System.out.println(a + oper + b + "=" + (a+b));
				break;
			case "-" : 
				System.out.println(a + oper + b + "=" + (a-b));
				break;
			case "/" : 
				System.out.println(a + oper + b + "=" + (a/b));
				break;
			case "*" : 
				System.out.println(a + oper + b + "=" + (a*b));	
				break;
			default :
				System.out.println("알수없음");
		}
	}

}
