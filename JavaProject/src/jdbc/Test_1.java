package jdbc;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = 100;
		int num2 = 0;
		// 스캐너로 숫자를 하나 입력받아서
		// num1 이상일 경우에만 num2에 저장
		// num1 미만의 숫자일 경우에는 다시 입력하도록 
		// 최종적으로 num1보다 큰 수 일때 출력하고 종료
		while(true) {
			System.out.print("숫자 하나 입력 : ");
			int input = scan.nextInt();
			if(input >= num1) {
				num2 = input;
				break;
			} else {
				System.out.println("100보다 큰 숫자 입력하세요.");
			}
		}
		
		
//		num2 = input >= num1 ? input : -1;
		System.out.println(num2);
		
	}
}
