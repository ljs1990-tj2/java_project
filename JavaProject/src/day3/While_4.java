package day3;

import java.util.Random;
import java.util.Scanner;

public class While_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int cnt = 0; // 정답 개수
		int qesNum = 0; // 총 문제 개수
		while(true) {
			System.out.print("구구단 시작(1), 채점(2), 종료(0) : ");
			int choiceNum = s.nextInt();
			if(choiceNum == 1) {
				System.out.print("몇문제 풀래? ");
				int num = s.nextInt();
				qesNum += num; // 문제 개수 추가
				for(int i=1; i<=num; i++) {
					int x = ran.nextInt(8) + 2; // 2~9
					int y = ran.nextInt(9) + 1; // 1~9
					int menu = 1;
					while(menu == 1) { // 다시 풀기를 요청했을 경우
						System.out.print(x + " * " + y + " = ");
						int answer = s.nextInt();
						if(x*y == answer) {
							System.out.println("정답!");
							menu = 0;
							cnt++;
						} else {
							System.out.println("오답");
							System.out.println("다시 풀래(1), 다음 문제(그외 숫자)");
							menu = s.nextInt();
						}
					}
				}
			} else if(choiceNum == 2) {
				System.out.println();
				System.out.println("현재까지 " + qesNum + "문제 중에 " + cnt + "문제 맞추셨습니다.");
				System.out.println();
			} else if(choiceNum == 0) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("0~2 중에 입력해라.");
			}
		}
		
	}
}
