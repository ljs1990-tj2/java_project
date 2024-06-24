package day2;

import java.util.Random;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int cnt = 0; // 맞춘 갯수
		for(int i=1; i<=5; i++) {
			int x = ran.nextInt(8) + 2; // 2~9
			int y = ran.nextInt(9) + 1; // 1~9
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();
			if((x * y) == answer) {
				System.out.println("정답!");
				cnt++; // 맞춘 갯수 증가
			} else {
				System.out.println("오답! 정답은 " + (x*y) + " 입니다." );
			}
		}
		System.out.println((cnt * 20) + "점 입니다.");
		
		
	}
}
