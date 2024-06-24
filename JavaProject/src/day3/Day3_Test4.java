package day3;

import java.util.Random;
import java.util.Scanner;

public class Day3_Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNum = ran.nextInt(100) + 1;
		System.out.print("숫자 입력 : ");
		int inputNum = scan.nextInt();
		if(randomNum == inputNum) {
			System.out.println("같다");
		} else if(randomNum > inputNum) {
			System.out.println("입력한 수가 더 작다");
		} else {
			System.out.println("입력한 수가 더 크다");
		}
	}

}
