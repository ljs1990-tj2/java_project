package day2;

import java.util.Scanner;

public class For_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 무한루프
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.print("숫자 입력(-1을 입력하면 종료) : ");
			int score = scan.nextInt();
			if(score == -1) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
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

}
