package day4;

public class Array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5,1,2};
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
