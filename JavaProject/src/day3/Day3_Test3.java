package day3;

import java.util.Scanner;

public class Day3_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 숫자를 하나 입력받고, 해당 숫자의 구구단 출력
//		(ex, 2입력시 2*1=2, 2*2=4, 2*3=6 ... 2*9=18 출력)
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
	}
}
