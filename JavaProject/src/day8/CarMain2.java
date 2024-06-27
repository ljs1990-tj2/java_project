package day8;

import java.util.Arrays;

public class CarMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1 ,2 ,3, 4, 5};
		int arr2[] = arr1;
		arr2[0] = 100000; // {100000, 2, 3, 4, 5}
		
		System.out.println(Arrays.toString(arr1));
		
	}

}
