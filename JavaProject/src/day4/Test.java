package day4;

public class Test {
	public static void main(String[] args) {
		int arr[] = {3, 30, 15, 50, 10};
		int index = 0;// 3
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[index]) {
				index = i;
			}
		}
		
	}
}
