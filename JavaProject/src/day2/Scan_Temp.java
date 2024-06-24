package day2;

import java.util.Scanner;

public class Scan_Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// next() => 공백이 있기 전까지, 엔터 or 스페이스
		System.out.println("첫번째 텍스트 : ");
		String txt = scan.next(); // \n(버퍼에 \n이 남은 상태)
		System.out.println(txt);
		
		// nextLine() => \n(엔터)를 만나면 실행
		scan.nextLine(); // 버퍼에 있는 \n 제거
		
		System.out.println("두번째 텍스트 : ");
		String txt2 = scan.nextLine();
		System.out.println(txt2);
	}

}
