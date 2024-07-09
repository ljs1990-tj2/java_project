package Test;

public class twoDArray2 {
	public static void main (String[] args) {
		int intArray[][] = new int[4][4];
		//{3,0,0,0}
		//{0,7,8,2}
		//{0,1,4,0}
		//{9,5,0,10}
		
		int num = 0;
		while (num < 10) { 
			int row = (int)(Math.random()*4); // 0~3
			int col = (int)(Math.random()*4); // 0~3
			if (intArray[row][col] != 0) { 
				continue;
			} else { 
				intArray[row][col] = ++num;
			}
		}
		
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
