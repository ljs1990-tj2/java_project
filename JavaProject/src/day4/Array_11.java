package day4;

public class Array_11 {
	public static void main(String[] args) {
		int arr[] = {10, -5, 7, 6, 8, 1};
		int sum = 0;
		for(int num : arr) { //{10, -5, 7, 6, 8, 1};
			sum += num;
		}

		System.out.println((double) sum / arr.length);
	}
}
