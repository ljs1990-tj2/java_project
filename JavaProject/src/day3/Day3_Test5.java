package day3;

public class Day3_Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 1부터 30까지 10~19의 숫자를 제외하고 화면에 출력하시오.
//		(ex, 1 2 3 4 5 6 7 8 9 20 21 22 ... 30)
		for(int i=1; i<=30; i++) {
			if(i>=10 && i<20) {
				continue;
			}
			System.out.println(i);
		}
	}

}
