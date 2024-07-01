package day10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String text = scan.nextLine();
			if(text.equals("그만")) {
				break;
			} else {
				StringTokenizer st = new StringTokenizer(text, " ");
				System.out.println("어절 개수는 " + st.countTokens());
			}
		}
		scan.close();
	}

}
