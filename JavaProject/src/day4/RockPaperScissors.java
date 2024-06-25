package day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int pWinNum = 0; // 사용자 승리 횟수
		int cWinNum = 0; // 컴퓨터 승리 횟수
		while(true) {
			System.out.println("가위(0), 바위(1) 보(2) 입력 :");
			int a = s.nextInt();
			if (a==0) {
				System.out.println("Player : 가위");
			}
			if (a==1) {
				System.out.println("Player : 바위");
			}
			if (a==2) {
				System.out.println("Player : 보");
			}
			Random r = new Random();
			int ran = r.nextInt(3);
			//컴퓨터
			int com=(int)(ran);
			
			if(com==0)	{
				System.out.println("컴퓨터 : 가위");
			}
			if(com==1)	{
				System.out.println("컴퓨터 : 바위");
			}
			if(com==2)	{
				System.out.println("컴퓨터 : 보");
			}
			
			if(com-a==-2 || com-a==1)	{
				System.out.println("컴퓨터 Win");
				cWinNum++;
			}
			if(com-a==-1 || com-a==2){
				System.out.println("플레이어 Win");
				pWinNum++;
			}
			if(com-a==0){
				System.out.println("비겼습니다.");
			}
			
			System.out.println("Player ==> " + pWinNum + "승 " + cWinNum + "패");
			System.out.println("재대결(1), 종료(2)");
				int re = s.nextInt();
			if(re == 2) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
