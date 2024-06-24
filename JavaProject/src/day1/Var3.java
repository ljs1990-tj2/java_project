package day1;

public class Var3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선위연산자, 후위연산자
		int num1 = 10;
		int num2 = num1++; // num2=10, num1=11
		num2 = --num1; // num2=10, num1=10
		num2 = num1--; // num2=10, num1=9
		System.out.println(num1);
		System.out.println(num2);
		
		
	}
}
