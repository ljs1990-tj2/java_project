package day2;

import java.util.Scanner;

public class For_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = scan.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
			
		}
		
	}
}
