package day2;

import java.util.Random;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		// num = 3;
		for(int i=1; i<=1; i++) {
			int num = ran.nextInt(2) + 1; // 1~2
			System.out.print("1, 2중에 선택 : ");
			int answer = s.nextInt();
			if(answer == num) {
				System.out.println("정답!");
			} else {
				System.out.println("오답!");
			}
			
		}
	}

}
