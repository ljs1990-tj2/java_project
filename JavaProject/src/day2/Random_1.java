package day2;

import java.util.Random;
import java.util.Scanner;

public class Random_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int ranNum = ran.nextInt(100) + 1; //1~100
		int cnt = 0;
		for(;;) {
			System.out.print("숫자를 입력하세요 : ");
			int input = s.nextInt();
			cnt++;
			if(ranNum > input) {
				System.out.println("UP!");
			} else if(ranNum < input) {
				System.out.println("DOWN!");
			} else {
				System.out.println("정답입니다!");
				System.out.println(cnt + "번 만에 맞추셨습니다.");
				break;
			}
		}
		
	}

}
