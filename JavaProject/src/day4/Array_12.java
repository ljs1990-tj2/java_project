package day4;

public class Array_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 향상된 for문을 이용해서 '양수'들의
		// 평균을 구하세요. 소수점까지
		int arr[] = {10, 30, -5, -8, 16};
		int sum = 0;
		int cnt = 0;
		for(int num : arr) {
			if(num >= 0) {
				sum += num;
				cnt++;
			}
		}
		System.out.println((double)sum / cnt); 
	
		
	}

}
