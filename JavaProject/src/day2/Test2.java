package day2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddSum = 0; // 홀수 합
		int evenSum = 0; // 짝수 합
		for(int i=1; i<=30; i++) {
			if(i % 2 == 1) {
				oddSum += i; // 홀수 들의 합				
			} else {
				evenSum += i; // 짝수 들의 합
			}
		}
		// Math.abs() => 절대 값
		System.out.println(Math.abs(oddSum - evenSum));	
	}
}
