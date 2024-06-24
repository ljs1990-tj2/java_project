package day4;

import java.util.Arrays;

public class Array_9 {
	public static void main(String[] args) {
		int arr[] = {3,4,5,2,1};
		int maxIndex = 0; 
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		// {3,4,5,2,1};
		int temp = arr[minIndex]; // 가장 작은 값 보관
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
