package day2;

import java.util.Scanner;

public class For_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 내가 입력한 숫자까지의 합은?
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int inputNum = s.nextInt();
		int sum = 0; 
		for(int i=1; i<=inputNum; i++) {
			sum += i; 
		}
		System.out.println(sum);
	}

}
