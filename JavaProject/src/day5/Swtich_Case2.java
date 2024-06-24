package day5;

import java.util.Scanner;

public class Swtich_Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int num = s.nextInt();

		switch (num / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
	}

}
