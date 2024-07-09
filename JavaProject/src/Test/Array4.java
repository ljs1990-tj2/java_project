package Test;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				arr[3][i] += arr[j][i];
			}
		}
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		
		
	}

}
