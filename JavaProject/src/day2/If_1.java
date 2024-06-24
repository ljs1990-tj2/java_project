package day2;

import java.util.Scanner;

public class If_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		if(num % 2 == 1) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("짝수 입니다."); 
		}
	}

}
