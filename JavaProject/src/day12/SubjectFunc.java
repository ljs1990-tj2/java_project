package day12;

import java.util.Scanner;

public class SubjectFunc {
	Scanner scan = new Scanner(System.in);
	public int scoreFunc(String subject, int max) {
		int score = 0;
		while(true) {
			System.out.print(subject + " >> ");
			score = scan.nextInt();
			if(score < 0 || score > max) {
				System.out.println(subject + "의 범위는 0부터 " + max + "까지 입니다.");
			} else {
				break;
			}
		}
		return score;
	}
}
