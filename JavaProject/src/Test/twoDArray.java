package Test;

public class twoDArray {
	public static void main (String[] args) {
		int arr[][] = new int[4][4];
		// (int)(Math.random()*10 + 1); 1~10
		//{0,0,0,0}
		//{0,0,0,0}
		//{0,0,0,0}
		//{0,0,0,0}
		
		for(int row=0; row<arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = (int) (Math.random() * 10 + 1);
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
