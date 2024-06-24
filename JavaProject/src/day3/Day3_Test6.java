package day3;

public class Day3_Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. while 문을 이용하여 2단부터 9단까지 구구단을 출력하시오.
//		단, 4단과 8단은 출력하지 말 것.
		// for(int i=2; i<=9; i++){}
		int i=2;
		while(i<=9) {
			int j=1;
			if(i % 4 == 0 ) {
				i++;
			}
			while(j<=9) {
				System.out.println(i + "*" + j);
				j++;
			}
			i++;
		}
	}
}
