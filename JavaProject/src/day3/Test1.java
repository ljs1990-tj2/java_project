package day3;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
			System.out.print("문제풀이 (1), 종료(그외 숫자) ");
			int menuNum = s.nextInt();
			if(menuNum == 1) {
				System.out.print("몇 문제 푸시겠습니까? ");
				int num = s.nextInt();
				for(int i=1; i<=num; i++) {
					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;
					System.out.print(x + " * " + y + " = ");
					int answer = s.nextInt();
					if(answer == x*y) {
						System.out.println("정답 !");
					} else {
						System.out.println("오답 !");
					}
				}
			} else {
				System.out.println("프로그램이 종료되었습니다");
				break;
			}
		}
		
	}
}
