package day1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		num2 = num1++; // num1 = 2, num2 = 1
		System.out.println(num1 == num2); // false
		System.out.println(num2 >= num1 && num2 >= num3);
		System.out.println(num1 % 2 == 0);
		System.out.println(!(num3 > num2));
		System.out.println(num1 >= num3 || num2 == 2);
	}

}
