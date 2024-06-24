package day4;

import java.util.Arrays;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 크기가 10인 배열에 1부터 10까지 순서대로 숫자 담기
		int arr[] = new int[10]; // [1,2,3, ... 10]
		for(int i=0; i<arr.length; i++) { // 배열의 크기만큼
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
