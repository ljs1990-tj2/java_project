package day2;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		if(num1 > 5) { 
			System.out.println("조건 만족!"); 
		} else {
			System.out.println("조건 불만족!");
		}
		
	}

}
