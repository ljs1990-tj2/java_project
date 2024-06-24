package day4;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,7,6,2};
		int sum = 0; // 전체 합을 저장할 변수
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); 
			sum += arr[i];
		}
		System.out.println("전체 합 : " + sum);
	}

}
