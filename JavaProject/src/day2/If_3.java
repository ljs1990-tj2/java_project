package day2;

import java.util.Scanner;

public class If_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int score = scan.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("잘못된 숫자임");
		} else if(score >= 80) {
			System.out.println("A");
		} else if(score >= 60) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}

}
