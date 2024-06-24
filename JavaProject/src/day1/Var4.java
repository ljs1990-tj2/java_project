package day1;

public class Var4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 15;
		int num3 = 15;
		
		System.out.println(num1 > num2); // false
		System.out.println(num2 <= num3); // true
		System.out.println(num2 == num3); // true
		System.out.println(num1 != num2); // true
		System.out.println(!true); // false
		System.out.println(num1+num2 > num3); // true
		System.out.println(7 / 2 > 3); // false
		System.out.println(7 % 2 == 0); // %(나머지 연산), false
		
		// and, or (num1 = 10, num2 =15, num3=15)
		// true and true => true
		System.out.println(num2>num1 && num2 >= num3);
		
		// false or true => true 
		System.out.println(num1>num2 || num2 >= num3);
		
		
		
	}

}
