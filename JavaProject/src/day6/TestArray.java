package day6;

public class TestArray {
	static void changeArray(int[] arr) {
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
		
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
	}
}
