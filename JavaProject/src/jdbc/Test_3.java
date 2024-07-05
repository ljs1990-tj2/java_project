package jdbc;

import java.util.Arrays;
import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		int arr[] = new int[5];
		// 숫자를 입력받아서 5개의 공간에 채우기
		// 중복은 안됨
		// [1,2,3,1,0]
//		for(int i=0; i<arr.length; i++) {
//			System.out.print((i+1) + "번째 숫자 입력 : ");
//			arr[i] = scan.nextInt();
//			for(int j=0; j<i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		int arr[] = new int[8];
		// 숫자를 입력받아서 8개의 공간에 채우기
		// 같은 숫자는 2개까지만 허용
		// [1,2,1,3,4,2,10,10] 가능(1->2개, 2->2개, 10->2개)
		// [1,2,1,3,1,2,10,20] 불가능(1->3개)
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			arr[i] = scan.nextInt();
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
					if(cnt >= 2) {
						System.out.println("동일한 숫자는 2개까지만 허용");
						i--;
						break;
					}
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
