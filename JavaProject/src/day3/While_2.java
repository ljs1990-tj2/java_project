package day3;

public class While_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 문으로 구구단 만들기
		int i = 2; // 첫번째 숫자 선언
		while(i <= 9){ // 첫번째 숫자 조건
			int j = 1; // 두번째 숫자 선언
			while(j <= 9) { // 두번째 숫자 조건
				System.out.println(i + "*" + j + "=");
				j++; // 두번째 숫자 증감
			}
			i++; // 첫번째 숫자 증감
		}

	}
}
