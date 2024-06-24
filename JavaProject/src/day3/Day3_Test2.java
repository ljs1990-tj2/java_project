package day3;

import java.util.Scanner;

public class Day3_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 숫자를 두개 입력받고, 
		// 두 수의 합이 10이 이상 경우 '큰 수' 
		// 아닐 경우 '작은 수' 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scan.nextInt();
		// 삼항연산자(if ~ else 쉽게)
//		String txt = num1+num2 >= 10 ? "큰 수" : "작은 수";
//		System.out.println(txt);
		if(num1 + num2 >= 10) {
			System.out.println("큰 수");
		} else {
			System.out.println("작은 수");
		}
	}
}
