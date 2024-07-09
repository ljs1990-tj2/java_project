package array;

public class Array_1 {
	public static void main(String[] args) {
		
//		int arr[][] = new int[2][5];
		
		int arr[][] = {{1,2,3,4,5}, {1,5,3}, {3,2,5,4,1}, {1,2}};
		// {1,2,3,4,5}    -> arr[0].length = 5;
		// {1,5,3}
		// {3,2,5,4,1}
		// {1,2}	-> arr[3].length = 2;
		int sum = 0;
		int num = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
				num++;
			}
		}
		
	}
}
