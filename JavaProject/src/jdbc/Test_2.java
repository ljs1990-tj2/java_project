package jdbc;

import java.util.Arrays;
import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = {1,3,4,10,0};
		// 숫자를 하나 입력받아서
		// arr에 중복된 숫자가 있으면 true 출력
		// 없으면 false 출력
		
//		System.out.print("숫자 입력 : ");
//		int input = scan.nextInt();
//		boolean flg = false;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == input) {
//				flg = true;
//				break;
//			} 
//		}
//		System.out.println(flg);
//		
		
		// 숫자를 하나 입력받아서 arr[4]에 넣기
		// arr배열에 중복된 값이 있으면 넣지 말고
		// 다시 입력받기
		// int arr[] = {1,3,4,10,0};
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int input = scan.nextInt();
			boolean flg = false;
			for(int i=0; i<arr.length; i++) {
				if(input == arr[i]) {
					System.out.println("다시 입력하세요.");
					flg = true;
					break;
				} 
			}
			if(flg == false) {
				arr[4] = input;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		// int arr[] = {1,3,4,10,0};
		// 용준씨 코드
//		System.out.print("숫자를 입력하시오 : ");
//		int input = scan.nextInt();
//		for (int i = 0; i < arr.length; i++) {
//			if (input == arr[i]) {
//				System.out.print("숫자를 다시 입력하세요 : ");
//				input = scan.nextInt();
//				i = -1;
//			} 
//		} 
//		arr[4] = input;
//		System.out.println(Arrays.toString(arr));
//		arr[4] = input;
		
		
// 		6개의 공간을 가지는 배열을 생성하고, 
//		랜덤하게 생성된 1부터 45사이의 값을 배열에 
//		넣으시오. 단, 중복 숫자는 허용하지 않음.
		
// 		배열 공간 5개 짜리 만들고,
//		숫자 입력받아서 넣는데 중복이 없이		
		
		
	}

}
