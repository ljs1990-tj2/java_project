package day10;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String txt = scan.nextLine();
		for(int i=0; i<txt.length(); i++) {
			txt = txt.substring(1) + txt.substring(0,1);
			System.out.println(txt);
		}
		scan.close();
		
		
	}

}
