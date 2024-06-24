package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 : ");
			arr[i] = scan.nextInt(); 
			if(arr[i] < 0) { // 음수일 경우
				System.out.println("0이상 입력하셔");
				i--; // 다시 해당 위치에 값을 입력하도록 i값 감소
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
